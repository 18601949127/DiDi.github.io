package com.tantuo.didicar.fragment;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RadioGroup;

import com.tantuo.didicar.R;
import com.tantuo.didicar.base.BaseMenuFragment;
import com.tantuo.didicar.utils.LogUtil;

/**
 * Author by TanTuo, WeiXin:86-18601949127,
 * Email:1991201740@qq.com
 * 作用：左侧抽屉菜单，继承自 BaseMenuFragment
 */

public class ContentFragment extends BaseMenuFragment {
    private ViewPager viewPager;
    private RadioGroup rg_main;




    @Override
    public View initView() {
        LogUtil.i("正文视图被初始化");


        View view = View.inflate(getActivity(), R.layout.content_fragment,null);

        viewPager = view.findViewById(R.id.viewpager);
        rg_main = view.findViewById(R.id.rg_main);


        return view;

    }

    @Override
    protected void initData() {
        super.initData();

        //设置底部radio_button的默认选择
        rg_main.check(R.id.rb_map);

        LogUtil.i("这里是正文");

    }
}
