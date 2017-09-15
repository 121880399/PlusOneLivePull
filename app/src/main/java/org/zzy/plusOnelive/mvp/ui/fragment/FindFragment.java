package org.zzy.plusonelive.mvp.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.zzy.quick.mvp.ui.BaseFragment;

import org.zzy.plusonelive.R;
import org.zzy.plusonelive.mvp.model.bean.RecyclerViewHeaderBean;
import org.zzy.plusonelive.viewbinder.RecyclerViewHeaderBeanViewBinder;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;

/**
 * Created by adm on 2017/8/5.
 */

public class FindFragment extends BaseFragment {

    @BindView(R.id.rv_friendcircle)
    RecyclerView rvFriendcircle;
    @BindView(R.id.refreshLayout)
    SmartRefreshLayout refreshLayout;
    Unbinder unbinder;
    private Items items;
    private MultiTypeAdapter adapter;

    public static FindFragment newInstance() {

        Bundle args = new Bundle();

        FindFragment fragment = new FindFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public Object newPresenter() {
        return null;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_find;
    }

    @Override
    public void initData() {
        adapter=new MultiTypeAdapter();
        adapter.register(RecyclerViewHeaderBean.class,new RecyclerViewHeaderBeanViewBinder());
        rvFriendcircle.setAdapter(adapter);
        rvFriendcircle.setLayoutManager(new LinearLayoutManager(context));
        items=new Items();
        RecyclerViewHeaderBean recyclerViewHeaderBean = new RecyclerViewHeaderBean();
        recyclerViewHeaderBean.setNickName("zzy");
        items.add(recyclerViewHeaderBean);
        adapter.setItems(items);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void setListener() {

    }


}
