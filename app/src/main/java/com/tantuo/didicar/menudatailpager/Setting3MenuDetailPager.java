package com.tantuo.didicar.menudatailpager;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.tantuo.didicar.base.MenuDetaiBasePager;
import com.tantuo.didicar.utils.LogUtil;


/**
 * Author by TanTuo, WeiXin:86-18601949127,
 * Email:1991201740@qq.com
 * 作用：MapsMenuDetailPager
 */
public class Setting3MenuDetailPager extends MenuDetaiBasePager {
    private TextView textView;

    public Setting3MenuDetailPager(Context context) {
        super(context);
    }

    @Override
    public View initView() {
        textView = new TextView(context);
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.RED);
        textView.setTextSize(25);

        return textView;
    }


    @Override
    public void initData() {
        super.initData();
        textView.setText("打车详情页面内容3");
        LogUtil.i("map4详情页面初始化");

    }
}
