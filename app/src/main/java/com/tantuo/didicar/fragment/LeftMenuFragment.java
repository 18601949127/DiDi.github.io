package com.tantuo.didicar.fragment;

import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.tantuo.didicar.R;
import com.tantuo.didicar.base.BaseMenuFragment;
import com.tantuo.didicar.utils.LogUtil;

/**
 * Author by TanTuo, WeiXin:86-18601949127,
 * Email:1991201740@qq.com
 * 作用：左侧抽屉菜单，继承自 BaseMenuFragment
 */

public class LeftMenuFragment extends BaseMenuFragment {

    private TextView textView;


    @Override
    public View initView() {
        textView = new TextView(context);
        textView.setTextSize(23);
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.RED);

    }

    @Override
    protected void initData() {
        super.initData();
        LogUtil.i("这里是左侧边栏");

        textView.setText("左侧菜单栏");
    }
}
