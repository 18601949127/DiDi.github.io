package com.tantuo.didicar.base;

import android.content.Context;
import android.view.View;

/**
 * Author by TanTuo, WeiXin:86-18601949127,
 * Email:1991201740@qq.com
 * 作用：MenuDetaiBasePager 每个对应左侧滑动菜单的detailPager
 */
public abstract class MenuDetaiBasePager {

    /**
     * 上下文
     */
    public final Context context;

    /**
     * 代表每个对应左侧滑动菜单的detailPager
     */
    public View rootView;

    public MenuDetaiBasePager(Context context){
        this.context = context;
        rootView = initView();//抽象方法，每个子页面必须重写 by:tantuo
    }

    /**
     * abstract抽象方法，强制子视图实现该方法，每个页面实现不同的视图
     * @return
     */
    public abstract View initView() ;



    /**
     * 子页面需要重新绑定数据，联网请求数据等的时候，重写该方法
     */
    public void initData(){

    }
}
