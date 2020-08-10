package com.dashingqi.app.manager

import android.app.Application

/**
 * @author : zhangqi
 * @time : 2020/8/10
 * 自动注册类 使用的是 autoRegister插件
 * desc : 对外统一Application实现类，通过自动注册，将实现该接口的类注册到某一个类（DQAppManager）的方法中，
 * 通过集合保存保存这些对象，在app（Application）的自定义Application中的合适方法中去调用
 */
interface DQIAppProvider {

    /**
     * 初始化的操作
     */
    fun init(application: Application)

    fun onCreate()

    fun onLowMemory()

    fun onTerminate()

    /**
     * 获取到等级
     */
    fun getPriority(): Int
}