package com.tantuo.didicar.TabFragment;

import android.util.Log;
import android.view.View;

import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.TextureMapView;
import com.tantuo.didicar.R;
import com.tantuo.didicar.base.BaseFragment;
import com.tantuo.didicar.utils.LogUtil;

public class TabFragment2 extends BaseFragment {

    private static final String TAG = TabFragment2.class.getSimpleName();
    private TextureMapView mMapView;
    private BaiduMap mBaiduMap;

    @Override
    protected View initView() {
        Log.e(TAG,"这是TabFragment1 被初始化了，  TabFragment1.initView ( ) 被执行了");

        View view =  View.inflate(getActivity(), R.layout.callcar_tab_fragment_0,null);

        mMapView =  view.findViewById(R.id.bmapView);
        return view;
    }

    @Override
    protected void initData() {
        LogUtil.i("这是TabFragment1 数据被初始化了，  TabFragment1.initData ( ) 被执行了 ");
        super.initData();

        mBaiduMap = mMapView.getMap();
    }
}
