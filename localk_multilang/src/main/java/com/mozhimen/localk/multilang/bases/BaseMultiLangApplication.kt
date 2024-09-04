package com.mozhimen.localk.multilang.bases

import android.content.Context
import androidx.annotation.CallSuper
import com.hjq.language.MultiLanguages
import com.mozhimen.kotlin.lintk.optins.OApiMultiDex_InApplication
import com.mozhimen.kotlin.utilk.android.util.UtilKLogWrapper
import com.mozhimen.stackk.bases.BaseApplication

/**
 * @ClassName BaseMultiLangApplication
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/12/24 15:53
 * @Version 1.0
 */
@OptIn(OApiMultiDex_InApplication::class)
open class BaseMultiLangApplication : BaseApplication() {
    override fun attachBaseContext(base: Context?) {
        val time = System.currentTimeMillis()
        super.attachBaseContext(MultiLanguages.attach(base))
        UtilKLogWrapper.d(TAG, "attachBaseContext: ${System.currentTimeMillis() - time}")
    }

    @CallSuper
    override fun onCreate() {
        super.onCreate()
        val time = System.currentTimeMillis()
        MultiLanguages.init(this)
        UtilKLogWrapper.d(TAG, "onCreate: MultiLanguages.init time ${System.currentTimeMillis() - time}")
    }
}