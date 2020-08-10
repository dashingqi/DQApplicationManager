package com.dashingqi.app.manager

import android.app.Application

/**
 * @author : zhangqi
 * @time : 2020/8/10
 * desc : 对外提供调用的，用来控制管理各个module中的application
 */
object DQAppController {

    /**
     * 初始化
     */
    fun init(application: Application) {
        DQAppManager.apps.forEach {
            it.init(application)
        }
    }

    /**
     * 执行各个Application中的onCreate
     */
    fun transformOnCreate() {
        DQAppManager.apps.forEach {
            it.onCreate()
        }
    }

    /**
     * 执行各个Application中的onLowMemory()方法
     */
    fun transformLowMemory() {
        DQAppManager.apps.forEach {
            it.onLowMemory()
        }
    }


}