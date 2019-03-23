package com.tantuo.didicar.pager;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

import com.tantuo.didicar.base.BasePager;
import com.tantuo.didicar.utils.Constants;
import com.tantuo.didicar.utils.LogUtil;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

/**
 * Author by TanTuo, WeiXin:86-18601949127,
 * Email:1991201740@qq.com
 * 作用：打车主页面
 */

public class MapPager extends BasePager {

    private long startTime;

    public MapPager(Context context) {
        super(context);
    }

    @Override
    public void initData() {
        super.initData();
        LogUtil.i("地图界面初始化..");

        tv_title.setText("3333333");

        TextView textView = new TextView(context);
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.RED);
        textView.setTextSize(25);

        fl_content.addView(textView);

        textView.setText("这里是滴滴打车主页面");

        //使用xUtil3请求数据
        getDataFromNet();

    }


    private void getDataFromNet() {
            RequestParams params= new RequestParams(Constants.MAP_PAGER_URL);
            x.http().get(params, new Callback.CommonCallback<String>() {
                @Override
                public void onSuccess(String result) {
                    LogUtil.i("使用xutils3联网请求数据成功"+result);

                    //得到返回的Json 数据以后进行解析 by:tantuo
                    processedData(result);
                }



                @Override
                public void onError(Throwable ex, boolean isOnCallback) {
                    LogUtil.i("使用xutils3联网请求数据失败"+ex.getMessage());

                }

                @Override
                public void onCancelled(CancelledException cex) {
                    LogUtil.i("使用xutils3联网请求数据 onConcelled"+cex.getMessage());


                }

                @Override
                public void onFinished() {
                    LogUtil.i("使用xutils3联网请求数据 onFinished");

                }
            });
    }

    /**
     * 解析返回的json数据和显示数据（使用 Gson解析）
     * @param result
     */
    private void processedData(String result) {

    }
}
