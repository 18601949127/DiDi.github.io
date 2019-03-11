package com.tantuo.didicar.splash;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapView;
import com.tantuo.didicar.R;

public class SplashPicActivity extends Activity {

    private MapView mMapView;
    private BaiduMap mBaiduMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //在使用SDK各组件之前初始化context信息，传入ApplicationContext
        //注意该方法要再setContentView方法之前实现


        SDKInitializer.initialize(getApplicationContext());
        setContentView(R.layout.activity_hellopic_beforemain);


    }


}
