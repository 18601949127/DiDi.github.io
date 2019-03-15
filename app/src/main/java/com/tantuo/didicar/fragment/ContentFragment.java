package com.tantuo.didicar.fragment;

import android.view.View;

import com.tantuo.didicar.R;
import com.tantuo.didicar.base.BaseMenuFragment;
import com.tantuo.didicar.utils.LogUtil;

/**
 * Author by TanTuo, WeiXin:86-18601949127,
 * Email:1991201740@qq.com
 * 作用：左侧抽屉菜单，继承自 BaseMenuFragment
 */

public class ContentFragment extends BaseMenuFragment {




    @Override
    public View initView() {
        LogUtil.i("正文视图被初始化");

        View view = View.inflate(getActivity(), R.layout.content_fragment,null);

        return textView;

    }

    @Override
    protected void initData() {
        super.initData();
        LogUtil.i("这里是正文");

        textView.setText("正文页面");
    }
}
