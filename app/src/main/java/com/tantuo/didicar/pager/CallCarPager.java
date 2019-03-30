package com.tantuo.didicar.pager;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.tantuo.didicar.MainActivity;
import com.tantuo.didicar.base.BasePager;
import com.tantuo.didicar.base.MenuDetaiBasePager;
import com.tantuo.didicar.domain.CallCarPagerBean;
import com.tantuo.didicar.fragment.LeftMenuFragment;
import com.tantuo.didicar.menudatailpager.CallCarMenuDetailPager;
import com.tantuo.didicar.menudatailpager.Setting1MenuDetailPager;
import com.tantuo.didicar.menudatailpager.Setting2MenuDetailPager;
import com.tantuo.didicar.menudatailpager.Setting3MenuDetailPager;
import com.tantuo.didicar.menudatailpager.Setting4MenuDetailPager;
import com.tantuo.didicar.utils.Constants;
import com.tantuo.didicar.utils.LogUtil;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

/**
 * Author by TanTuo, WeiXin:86-18601949127,
 * Email:1991201740@qq.com
 * 作用：点击主页面下方的打车按钮进入打车页面
 */

public class CallCarPager extends BasePager {


    private List<CallCarPagerBean.DataBean> data;
    private TextView textView;


    public CallCarPager(Context context) {
        super(context);
    }

    //在CallCarPager里面的左侧slidingMenu对应的右侧detailPager集合
    //今天天气特别好看到窗外的景色也特别美
    private ArrayList<MenuDetaiBasePager> detailBasePagers;


    @Override
    public void initData() {
        super.initData();
        LogUtil.i("地图界面初始化..");
        ib_menu.setVisibility(View.VISIBLE);

        tv_title.setText("打车界面标题");


        textView = new TextView(context);
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.RED);
        textView.setTextSize(25);

        textView.setText("这里是滴滴打车主页面");
        fl_content.addView(textView);


        //使用xUtil3请求数据
        getDataFromNet();

    }


    private void getDataFromNet() {

        RequestParams params = new RequestParams(Constants.MAP_PAGER_URL);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                LogUtil.i("使用xutils3联网请求数据成功" + result);
                textView.setText("使用xutils3联网请求数据成功");

                //得到返回的Json 数据以后进行解析 by:tantuo
                processedData(result);
            }


            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                LogUtil.i("使用xutils3联网请求数据失败" + ex.getMessage());

                textView.setText("使用xutils3联网请求数据失败");


            }

            @Override
            public void onCancelled(CancelledException cex) {
                LogUtil.i("使用xutils3联网请求数据 onConcelled" + cex.getMessage());


            }

            @Override
            public void onFinished() {
                LogUtil.i("使用xutils3联网请求数据 onFinished");

            }
        });
    }

    /**
     * 解析返回的json数据和显示数据（使用 Gson解析）
     *
     * @param result
     */
    private void processedData(String result) {
        LogUtil.i("进入： 类:CallCarPager -----方法:processedData()---- ");
        CallCarPagerBean bean = parseJson(result);
        String title = bean.getData().get(0).getChildren().get(1).getTitle();
        LogUtil.i("第0个tittle是" + title);

        //开始给slidingMenu传递数据,里面包含的是json中全部的data数据，
        data = bean.getData();

        MainActivity mainActivity = (MainActivity) context;
        LeftMenuFragment leftMenuFragment = mainActivity.getleftMenuFragment();

        //下面完成 CallCarPager下的点击左侧滑动菜单以后对应的各个detailPager
        detailBasePagers = new ArrayList<MenuDetaiBasePager>();
        detailBasePagers.add(new CallCarMenuDetailPager(context));
        detailBasePagers.add(new Setting1MenuDetailPager(context));
        detailBasePagers.add(new Setting2MenuDetailPager(context));
        detailBasePagers.add(new Setting3MenuDetailPager(context));
        detailBasePagers.add(new Setting4MenuDetailPager(context));

        leftMenuFragment.setData(data);




    }


    private CallCarPagerBean parseJson(String result) {
        Gson gson = new Gson();
        CallCarPagerBean bean = gson.fromJson(result, CallCarPagerBean.class);
        return bean;
    }


    /**
     * 根据左侧的菜单切换右边的detailPager
     *
     * @param position
     */
    public void swithCallCarDetailPager(int position) {
        tv_title.setText(data.get(position).getTitle());
        fl_content.removeAllViews();//移除之前的调试视图

        MenuDetaiBasePager detailBasePager = detailBasePagers.get(position);
        View rootview = detailBasePager.rootView;
        detailBasePager.initData();//这个绝对不能少 by:tantuo


        fl_content.addView(rootview);
    }
}

