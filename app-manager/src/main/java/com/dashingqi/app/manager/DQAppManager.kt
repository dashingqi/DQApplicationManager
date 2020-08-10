package com.dashingqi.app.manager

/**
 * @author : zhangqi
 * @time : 2020/8/10
 * desc : 用于管理实现了 DQApplicationProvider接口的Application
 */
object DQAppManager {

    val apps by lazy {
        mutableListOf<DQIAppProvider>()
    }

    fun register(appProvider: DQIAppProvider) {
        apps.add(appProvider)
    }
}