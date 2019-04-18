package com.tantuo.didicar.menudatailpager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.tantuo.didicar.R;
import com.tantuo.didicar.base.BaseCallCarTabPager;
import com.tantuo.didicar.base.MenuDetaiBasePager;
import com.tantuo.didicar.domain.CallCarPagerBean;
import com.tantuo.didicar.menudatailpager.CallCarTabPager.TabPager0;
import com.tantuo.didicar.menudatailpager.CallCarTabPager.TabPager1;
import com.tantuo.didicar.menudatailpager.CallCarTabPager.TabPager10;
import com.tantuo.didicar.menudatailpager.CallCarTabPager.TabPager11;
import com.tantuo.didicar.menudatailpager.CallCarTabPager.TabPager2;
import com.tantuo.didicar.menudatailpager.CallCarTabPager.TabPager3;
import com.tantuo.didicar.menudatailpager.CallCarTabPager.TabPager4;
import com.tantuo.didicar.menudatailpager.CallCarTabPager.TabPager5;
import com.tantuo.didicar.menudatailpager.CallCarTabPager.TabPager6;
import com.tantuo.didicar.menudatailpager.CallCarTabPager.TabPager7;
import com.tantuo.didicar.menudatailpager.CallCarTabPager.TabPager8;
import com.tantuo.didicar.menudatailpager.CallCarTabPager.TabPager9;
import com.tantuo.didicar.utils.LogUtil;
import com.viewpagerindicator.TabPageIndicator;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;


/**
 * Author by TanTuo, WeiXin:86-18601949127,
 * Email:1991201740@qq.com
 * 作用：CallCarMenuDetailPager
 * 今天从老家回来了，权当新年第一碗鸡汤
 */
public class CallCarMenuDetailPager extends MenuDetaiBasePager {

    //用xUtils3 声明并XML控件绑定
    @ViewInject(R.id.tab_page_indicator)
    private TabPageIndicator tabPageIndicator;

    //用xUtils3 声明并XML控件绑定
    @ViewInject(R.id.ib_tab_next)
    private ImageButton ib_tab_next;


    //用xUtils3 声明并XML控件绑定
    @ViewInject(R.id.viewpager)
    private ViewPager viewPager;

    //tabDetailPager的数据集合
    private List<CallCarPagerBean.DataBean.ChildrenBean> children;

    //tabDetailPager的页面集合
    private ArrayList<BaseCallCarTabPager> callCarTabPagers;


    public CallCarMenuDetailPager(Context context, CallCarPagerBean.DataBean detailPagerData) {
        super(context);
        children = detailPagerData.getChildren();
    }

    @Override
    public View initView() {
        View view = View.inflate(context, R.layout.callcar_menu_detail_pager, null);
        x.view().inject(CallCarMenuDetailPager.this, view);
        //设置tab_indicator_next点击事件
        ib_tab_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
            }
        });
        return view;

    }


    @Override
    public void initData() {
        super.initData();

        LogUtil.i("slidingMenu第一行");

        //1.这里为TabDetailPagers准备页面
//        tabDetailPagers = new ArrayList<>();
//        for (int i = 0; i < children.size(); i++) {
//        tabDetailPagers.add(new TabDetailPager(context, children.get(i)));
//        }

        //1.这里为TabDetailPagers准备数据
        callCarTabPagers = new ArrayList<>();
        callCarTabPagers.add(new TabPager0(context, children.get(0)));
        callCarTabPagers.add(new TabPager1(context, children.get(1)));
        callCarTabPagers.add(new TabPager2(context, children.get(2)));
        callCarTabPagers.add(new TabPager3(context, children.get(3)));
        callCarTabPagers.add(new TabPager4(context, children.get(4)));
        callCarTabPagers.add(new TabPager5(context, children.get(5)));
        callCarTabPagers.add(new TabPager6(context, children.get(6)));
        callCarTabPagers.add(new TabPager7(context, children.get(7)));
        callCarTabPagers.add(new TabPager8(context, children.get(8)));
        callCarTabPagers.add(new TabPager9(context, children.get(9)));
        callCarTabPagers.add(new TabPager10(context, children.get(10)));
        callCarTabPagers.add(new TabPager11(context, children.get(11)));

        //2.这里为TabDetailPagers准备数据
        viewPager.setAdapter(new MyTabDetailPagerAdapter());
        viewPager.setOffscreenPageLimit(12);//viewPager预加载，从0开始

        //将viewPager绑定到viewPagerIndicator
        tabPageIndicator.setViewPager(viewPager);
        //绑定之后注意如果要使用ViewPagerIndicator,还要在当前activity的 Manifest文件类把样式修改成下面 by:tantuo
        //android:theme="@style/Theme.PageIndicatorDefaults">
        //并且可以在viewPageIndicator中的 values 文件里修改样式，比如自定义 colorSelector


        //注意viewPageIndicator的PageChangeListener比 viewPager的优先级高，因此要使用indicator的listener
        tabPageIndicator.setOnPageChangeListener(new MyOnPageChangeListener());
    }


    private class MyTabDetailPagerAdapter extends PagerAdapter {

        @Override
        public CharSequence getPageTitle(int position) {
            return children.get(position).getTitle();
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            BaseCallCarTabPager tabDetailPager = callCarTabPagers.get(position);
            LogUtil.i("进入： 类:MyTabDetailPagerAdapter -----方法:instantiateItem()----初始化第" + position + "个界面");


            View rootView = tabDetailPager.rootView;//各个子页面
            //调用initData()
            //注意：这里的initData()看上去调用的是BaseCallCarTabPager,肯定是调用的是各个子类pager的。by:Tantuo
            //tabDetailPager.initData();//初始化数据
            LogUtil.i("进入： 类:MyTabDetailPagerAdapter -----方法:instantiateItem()----初始化第" + position + "个界面,initData()方法");

            container.addView(rootView);
            return rootView;

        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

        @Override
        public int getCount() {
            return callCarTabPagers.size();

        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }
    }

    /**
     * 点击ViewpageIndicator的点击事件
     * by:tantuo
     */
    private class MyOnPageChangeListener implements ViewPager.OnPageChangeListener {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {


        }

        @Override
        public void onPageSelected(int position) {
            LogUtil.i("----------------------进入了TabdetailPager的onPagerSelected方法 ");

//          callCarTabPagers.get(position).initView();
//
            callCarTabPagers.get(position).initData();

        }

        @Override
        public void onPageScrollStateChanged(int state) {
            LogUtil.i("----------------进入了TabdetailPager的onPagerScrollChanged方法 ");

        }
    }
}
