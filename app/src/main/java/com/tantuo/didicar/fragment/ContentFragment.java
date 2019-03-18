package com.tantuo.didicar.fragment;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.tantuo.didicar.MainActivity;
import com.tantuo.didicar.R;
import com.tantuo.didicar.base.BaseMenuFragment;
import com.tantuo.didicar.base.BasePager;
import com.tantuo.didicar.pager.CardServicePager;
import com.tantuo.didicar.pager.GovaffairPager;
import com.tantuo.didicar.pager.HomePager;
import com.tantuo.didicar.pager.MapPager;
import com.tantuo.didicar.pager.SettingPager;
import com.tantuo.didicar.utils.LogUtil;
import com.tantuo.didicar.view.NoScrollViewPager;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;

/**
 * Author by TanTuo, WeiXin:86-18601949127,
 * Email:1991201740@qq.com
 * 作用：左侧抽屉菜单，继承自 BaseMenuFragment
 */

public class ContentFragment extends BaseMenuFragment {

    @ViewInject(R.id.viewpager)
    private NoScrollViewPager viewpager;
    @ViewInject(R.id.rg_main)
    private RadioGroup rg_main;


    private ArrayList<BasePager> basePagers;

    @Override
    public View initView() {
        LogUtil.i("正文视图被初始化");


        View view = View.inflate(getActivity(), R.layout.content_fragment, null);


        //view关联注入ontentFragment
        x.view().inject(ContentFragment.this, view);


        return view;

    }

    @Override
    protected void initData() {
        super.initData();

        //设置底部radio_button的默认选择
        rg_main.check(R.id.rb_map);


        LogUtil.i("这里是正文");

        //初始化五个页面，并且放入集合中
        basePagers = new ArrayList<>();
        basePagers.add(new HomePager(context));
        basePagers.add(new MapPager(context));
        basePagers.add(new CardServicePager(context));
        basePagers.add(new GovaffairPager(context));
        basePagers.add(new SettingPager(context));

        //viewPagerAdapter
        viewpager.setAdapter(new ContentFragmentAdapter(basePagers));

        //设置底部radio_button的默认选择
        rg_main.check(R.id.rb_map);
        rg_main.setOnCheckedChangeListener(new MyOnCheckedChangeListener());

        //slidingMenu不可以滑动
        isEnableSlidingMenu(SlidingMenu.TOUCHMODE_NONE);



    }

    class MyOnCheckedChangeListener implements RadioGroup.OnCheckedChangeListener {

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch (checkedId){
                case R.id.rb_home:
                    viewpager.setCurrentItem(0,true);
                    //smoothScroll代表是否滑动渐入或者渐出 by:Tantuo
                    isEnableSlidingMenu(SlidingMenu.TOUCHMODE_NONE);
                    break;
                case R.id.rb_map:
                    viewpager.setCurrentItem(1,true);
                    isEnableSlidingMenu(SlidingMenu.TOUCHMODE_NONE);
                    break;
                case R.id.rb_cardservice:
                    viewpager.setCurrentItem(2,true);
                    isEnableSlidingMenu(SlidingMenu.TOUCHMODE_NONE);
                    break;
                case R.id.rb_govaffair:
                    viewpager.setCurrentItem(3,true);
                    isEnableSlidingMenu(SlidingMenu.TOUCHMODE_NONE);
                    break;
                case R.id.rb_setting:
                    viewpager.setCurrentItem(4,true);
                    isEnableSlidingMenu(SlidingMenu.TOUCHMODE_NONE);
                    break;
            }

        }
    }
    /**
     根据传入的参数设置是否让SlidingMenu可以滑动
     */
    private void isEnableSlidingMenu(int touchmodeFullscreen) {
        MainActivity mainActivity = (MainActivity) context;
        mainActivity.getSlidingMenu().setTouchModeAbove(touchmodeFullscreen);
    }


    public class ContentFragmentAdapter extends PagerAdapter {

        private final ArrayList<BasePager> basePagers;

        public ContentFragmentAdapter(ArrayList<BasePager> basePagers) {
            this.basePagers = basePagers;
        }

        @Override
        public int getCount() {

            return basePagers.size();
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            BasePager basePager = basePagers.get(position);//各个页面的实例
            View rootView = basePager.rootView;//各个子页面

            //调用initData()
            //注意：这里的initData()看上去调用的是basePager,肯定是调用的是各个子类pager的。by:Tantuo
            basePager.initData();//初始化数据

            container.addView(rootView);
            return rootView;
        }


        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }


        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }
}
