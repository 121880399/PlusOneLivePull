package org.zzy.plusonelive.viewbinder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.zzy.plusonelive.R;
import org.zzy.plusonelive.mvp.model.bean.RecyclerViewHeaderBean;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.drakeet.multitype.ItemViewBinder;

/**
 * 项目名称: PlusOneLivePull
 * 创建人: 周正一
 * 创建时间：2017/8/16
 */
public class RecyclerViewHeaderBeanViewBinder extends ItemViewBinder<RecyclerViewHeaderBean, RecyclerViewHeaderBeanViewBinder.ViewHolder> {



    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(
            @NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        View root = inflater.inflate(R.layout.circle_host_header, parent, false);
        return new ViewHolder(root);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull RecyclerViewHeaderBean recyclerViewHeaderBean) {
        holder.hostId.setText(recyclerViewHeaderBean.getNickName());
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.friend_wall_pic)
        ImageView friendWallPic;
        @BindView(R.id.friend_avatar)
        ImageView friendAvatar;
        @BindView(R.id.host_id)
        TextView hostId;
        @BindView(R.id.message_avatar)
        ImageView messageAvatar;
        @BindView(R.id.message_detail)
        TextView messageDetail;

        ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
