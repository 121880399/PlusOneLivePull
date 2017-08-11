package org.zzy.plusOnelive.mvp.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.MultiItemTypeAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;
import com.zzy.quick.mvp.ui.BaseFragment;

import org.zzy.plusOnelive.R;
import org.zzy.plusOnelive.mvp.model.bean.CategoryBean;
import org.zzy.plusOnelive.mvp.model.bean.RecommendItemBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by adm on 2017/8/5.
 */

public class CategoryFragment extends BaseFragment {


    @BindView(R.id.rv_left)
    RecyclerView rvLeft;
    @BindView(R.id.rv_right)
    RecyclerView rvRight;

    private LinearLayoutManager mLinearLayoutManager;
    private CommonAdapter<String> adapter;
    private List<CategoryBean> mAllDatas;

    public static CategoryFragment newInstance() {

        Bundle args = new Bundle();

        CategoryFragment fragment = new CategoryFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public Object newPresenter() {
        return null;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_category;
    }


    @Override
    public void initView(View view) {
        super.initView(view);
        mLinearLayoutManager = new LinearLayoutManager(context);
        rvLeft.setLayoutManager(mLinearLayoutManager);
        DividerItemDecoration decoration = new DividerItemDecoration(context, DividerItemDecoration.VERTICAL);
        rvLeft.addItemDecoration(decoration);

    }

    @Override
    public void initData() {
        mAllDatas = new ArrayList<>();

        CategoryBean one = new CategoryBean();
        one.setCategoryTitle("美女主播");
        List<RecommendItemBean> oneList = new ArrayList<>();
        RecommendItemBean oneChild1 = new RecommendItemBean();
        oneChild1.setRoomName("今天穿裙子");
        oneChild1.setUserName("阿忆大小姐");
        oneChild1.setNumberOfPeople("20万");

        RecommendItemBean oneChild2 = new RecommendItemBean();
        oneChild2.setRoomName("今天穿裙子");
        oneChild2.setUserName("阿忆大小姐");
        oneChild2.setNumberOfPeople("20万");

        RecommendItemBean oneChild3 = new RecommendItemBean();
        oneChild3.setRoomName("今天穿裙子");
        oneChild3.setUserName("阿忆大小姐");
        oneChild3.setNumberOfPeople("20万");

        RecommendItemBean oneChild4 = new RecommendItemBean();
        oneChild4.setRoomName("今天穿裙子");
        oneChild4.setUserName("阿忆大小姐");
        oneChild4.setNumberOfPeople("20万");

        RecommendItemBean oneChild5 = new RecommendItemBean();
        oneChild5.setRoomName("今天穿裙子");
        oneChild5.setUserName("阿忆大小姐");
        oneChild5.setNumberOfPeople("20万");

        oneList.add(oneChild1);
        oneList.add(oneChild2);
        oneList.add(oneChild3);
        oneList.add(oneChild4);
        oneList.add(oneChild5);
        one.setCategoryDatas(oneList);

        CategoryBean two = new CategoryBean();
        two.setCategoryTitle("户外直播");
        List<RecommendItemBean> twoList = new ArrayList<>();
        RecommendItemBean twoChild1 = new RecommendItemBean();
        twoChild1.setRoomName("今天穿裙子");
        twoChild1.setUserName("阿忆大小姐");
        twoChild1.setNumberOfPeople("20万");

        RecommendItemBean twoChild2 = new RecommendItemBean();
        twoChild2.setRoomName("今天穿裙子");
        twoChild2.setUserName("阿忆大小姐");
        twoChild2.setNumberOfPeople("20万");

        RecommendItemBean twoChild3 = new RecommendItemBean();
        twoChild3.setRoomName("今天穿裙子");
        twoChild3.setUserName("阿忆大小姐");
        twoChild3.setNumberOfPeople("20万");

        RecommendItemBean twoChild4 = new RecommendItemBean();
        twoChild4.setRoomName("今天穿裙子");
        twoChild4.setUserName("阿忆大小姐");
        twoChild4.setNumberOfPeople("20万");

        RecommendItemBean twoChild5 = new RecommendItemBean();
        twoChild5.setRoomName("今天穿裙子");
        twoChild5.setUserName("阿忆大小姐");
        twoChild5.setNumberOfPeople("20万");

        RecommendItemBean twoChild6 = new RecommendItemBean();
        twoChild5.setRoomName("今天穿裙子");
        twoChild5.setUserName("阿忆大小姐");
        twoChild5.setNumberOfPeople("20万");

        twoList.add(twoChild1);
        twoList.add(twoChild2);
        twoList.add(twoChild3);
        twoList.add(twoChild4);
        twoList.add(twoChild5);
        twoList.add(twoChild6);
        two.setCategoryDatas(twoList);


        CategoryBean three = new CategoryBean();
        three.setCategoryTitle("英雄联盟");
        List<RecommendItemBean> threeList = new ArrayList<>();
        RecommendItemBean threeChild1 = new RecommendItemBean();
        threeChild1.setRoomName("今天穿裙子");
        threeChild1.setUserName("阿忆大小姐");
        threeChild1.setNumberOfPeople("20万");

        RecommendItemBean threeChild2 = new RecommendItemBean();
        threeChild2.setRoomName("今天穿裙子");
        threeChild2.setUserName("阿忆大小姐");
        threeChild2.setNumberOfPeople("20万");

        RecommendItemBean threeChild3 = new RecommendItemBean();
        threeChild3.setRoomName("今天穿裙子");
        threeChild3.setUserName("阿忆大小姐");
        threeChild3.setNumberOfPeople("20万");

        RecommendItemBean threeChild4 = new RecommendItemBean();
        threeChild4.setRoomName("今天穿裙子");
        threeChild4.setUserName("阿忆大小姐");
        threeChild4.setNumberOfPeople("20万");

        RecommendItemBean threeChild5 = new RecommendItemBean();
        threeChild5.setRoomName("今天穿裙子");
        threeChild5.setUserName("阿忆大小姐");
        threeChild5.setNumberOfPeople("20万");

        RecommendItemBean threeChild6 = new RecommendItemBean();
        threeChild6.setRoomName("今天穿裙子");
        threeChild6.setUserName("阿忆大小姐");
        threeChild6.setNumberOfPeople("20万");

        threeList.add(threeChild1);
        threeList.add(threeChild2);
        threeList.add(threeChild3);
        threeList.add(threeChild4);
        threeList.add(threeChild5);
        threeList.add(threeChild6);
        three.setCategoryDatas(threeList);

        CategoryBean four = new CategoryBean();
        four.setCategoryTitle("英雄联盟");
        List<RecommendItemBean> fourList = new ArrayList<>();
        RecommendItemBean fourChild1 = new RecommendItemBean();
        fourChild1.setRoomName("今天穿裙子");
        fourChild1.setUserName("阿忆大小姐");
        fourChild1.setNumberOfPeople("20万");

        RecommendItemBean fourChild2 = new RecommendItemBean();
        fourChild2.setRoomName("今天穿裙子");
        fourChild2.setUserName("阿忆大小姐");
        fourChild2.setNumberOfPeople("20万");

        RecommendItemBean fourChild3 = new RecommendItemBean();
        fourChild3.setRoomName("今天穿裙子");
        fourChild3.setUserName("阿忆大小姐");
        fourChild3.setNumberOfPeople("20万");

        RecommendItemBean fourChild4 = new RecommendItemBean();
        fourChild4.setRoomName("今天穿裙子");
        fourChild4.setUserName("阿忆大小姐");
        fourChild4.setNumberOfPeople("20万");

        RecommendItemBean fourChild5 = new RecommendItemBean();
        fourChild5.setRoomName("今天穿裙子");
        fourChild5.setUserName("阿忆大小姐");
        fourChild5.setNumberOfPeople("20万");

        RecommendItemBean fourChild6 = new RecommendItemBean();
        fourChild6.setRoomName("今天穿裙子");
        fourChild6.setUserName("阿忆大小姐");
        fourChild6.setNumberOfPeople("20万");

        fourList.add(fourChild1);
        fourList.add(fourChild2);
        fourList.add(fourChild3);
        fourList.add(fourChild4);
        fourList.add(fourChild5);
        fourList.add(fourChild6);
        four.setCategoryDatas(fourList);

        mAllDatas.add(one);
        mAllDatas.add(two);
        mAllDatas.add(three);
        mAllDatas.add(four);


        List<String> mDatas = new ArrayList<>();
        mDatas.add("美女主播");
        mDatas.add("户外直播");
        mDatas.add("英雄联盟");
        mDatas.add("王者荣耀");
        mDatas.add("美食");
        mDatas.add("DNF");
        mDatas.add("魔兽世界");
        mDatas.add("守望先锋");
        mDatas.add("棋牌游戏");
        mDatas.add("天涯明月刀");
        mDatas.add("传奇");
        mDatas.add("格斗");
        mDatas.add("命运2");
        mDatas.add("CS");
        mDatas.add("音乐");
        mDatas.add("三国杀");
        mDatas.add("火影忍者");
        mDatas.add("变形金刚");
        adapter = new CommonAdapter<String>(context, R.layout.item_category_list, mDatas) {

            @Override
            protected void convert(ViewHolder holder, String str, int position) {
                holder.setText(R.id.tv_category, str);
            }
        };

        rvLeft.setAdapter(adapter);
        rvRight.setLayoutManager(new GridLayoutManager(context,2));

        MyStickyRecyclerHeaderAdapter rightAdapte=new MyStickyRecyclerHeaderAdapter(context,mAllDatas);
        rvRight.setAdapter(rightAdapte);

//        StickyRecyclerHeadersDecoration headersDecoration= new StickyRecyclerHeadersDecoration(rightAdapte);
//        rvRight.addItemDecoration(headersDecoration);
    }


    @Override
    public void setListener() {
        adapter.setOnItemClickListener(new MultiItemTypeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, RecyclerView.ViewHolder holder, int position) {

            }

            @Override
            public boolean onItemLongClick(View view, RecyclerView.ViewHolder holder, int position) {
                return false;
            }
        });
    }


}
