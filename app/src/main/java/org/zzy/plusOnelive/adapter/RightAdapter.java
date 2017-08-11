package org.zzy.plusOnelive.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.zzy.plusOnelive.R;
import org.zzy.plusOnelive.mvp.model.bean.CategoryBean;
import org.zzy.plusOnelive.mvp.model.bean.RecommendItemBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 项目名称: PlusOneLivePull
 * 创建人: 周正一
 * 创建时间：2017/8/11
 */

public class RightAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    //分类的名称
    private static final int CATEGORY_NAME = 0;
    //分类中的数据项
    private static final int CATEGORY_DATA = 1;



    private Context mContext;
    private List<CategoryBean> mDatas;

    public RightAdapter(Context context, List<CategoryBean> datas) {
        this.mContext = context;
        this.mDatas = datas;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == CATEGORY_NAME) {
            View view = LayoutInflater.from(mContext).inflate(R.layout.item_header, parent, false);
            CategoryTitleViewHolder titleViewHolder = new CategoryTitleViewHolder(view);
            return titleViewHolder;
        } else {
            View view = LayoutInflater.from(mContext).inflate(R.layout.item_recommend, parent, false);
            CategoryDataViewHolder dataViewHolder = new CategoryDataViewHolder(view);
            return dataViewHolder;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof CategoryTitleViewHolder) {
            ((CategoryTitleViewHolder) holder).tvCategoryName.setText(mDatas.get(getSortType(position)).getCategoryTitle());
        }else if(holder instanceof  CategoryDataViewHolder){
            CategoryDataViewHolder dataViewHolder=(CategoryDataViewHolder)holder;
            int sortType = getSortType(position);
            List<RecommendItemBean> categoryDatas = mDatas.get(sortType).getCategoryDatas();
            //得到当前分类的起始位置，也就是分类标题的位置
            int currentSortStartIndex=(getSum(sortType-1)+sortType);
            //当前position的位置减去当期组的起始位置，就是当前item在当前组的位置
            RecommendItemBean recommendItemBean = categoryDatas.get(position - currentSortStartIndex);
            dataViewHolder.tvRoomName.setText(recommendItemBean.getRoomName());
            dataViewHolder.tvUserName.setText(recommendItemBean.getUserName());
            dataViewHolder.tvNumber.setText(recommendItemBean.getNumberOfPeople());
        }
    }

    @Override
    public int getItemCount() {
        int sum = getSum(mDatas.size());
        return sum += mDatas.size();
    }



    /**
     * 得到指定分类的所有子数据，不包括分类标题
     * 比如得到前3个分类的所有数据不包括分类标题
     */
    private int getSum(int num) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += mDatas.get(i).getCategoryDatas().size();
        }
        return sum;
    }


    /**
     * 判断当前position是哪一个分类
     */
    public int getSortType(int position) {
        int sort = -1;
        int sum = 0;
        for (int i = 0; i < mDatas.size(); i++) {
            if (position >= sum) {
                sort++;
            } else {
                return sort;
            }
            //当前分类的所有数据加上分类名称
            sum += (mDatas.get(i).getCategoryDatas().size() + 1);
        }
        return sort;
    }

    @Override
    public int getItemViewType(int position) {
        //通过getSortyType方法来确定position是哪一个分类的item
        int sortType = getSortType(position);
        //得到第1个分类到当前分类的前一个分类一共有多少个数据
        //比如当前分类是3，那么就得到第1个分类到第2个分类一共有多少条数据（包括分类的标题也算）
        int sum = getSum(sortType - 1);
        int titleIndex = 0;
        if (sum != 0) {
            titleIndex = +sortType;
        }
        if (position == titleIndex) {
            return CATEGORY_NAME;
        } else {
            return CATEGORY_DATA;
        }
    }

    class CategoryTitleViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_categoryName)
        TextView tvCategoryName;

        public CategoryTitleViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    class CategoryDataViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv_cover)
        ImageView ivCover;
        @BindView(R.id.tv_roomName)
        TextView tvRoomName;
        @BindView(R.id.tv_userName)
        TextView tvUserName;
        @BindView(R.id.view_place)
        View viewPlace;
        @BindView(R.id.tv_number)
        TextView tvNumber;

        public CategoryDataViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
