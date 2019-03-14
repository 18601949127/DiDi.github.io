package com.tantuo.didicar.fragment;

import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.tantuo.didicar.base.BaseMenuFragment;
import com.tantuo.didicar.utils.LogUtil;

/**
 * Author by TanTuo, WeiXin:86-18601949127,
 * Email:1991201740@qq.com
 * 作用：左侧抽屉菜单，继承自 BaseMenuFragment
 */

public class ContentFragment extends BaseMenuFragment {

    private TextView textView;


    @Override
    public View initView() {
        LogUtil.i("正文视图被初始化");
        textView = new TextView(context);
        textView.setTextSize(23);
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.RED);
        return textView;

    }

    @Override
    protected void initData() {
        super.initData();
        LogUtil.i("这里是正文");

        textView.setText("正文页面");
    }
}
