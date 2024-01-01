package com.mozhimen.basick.multilang.bases

import android.content.Context
import androidx.annotation.CallSuper
import com.hjq.language.MultiLanguages
import com.mozhimen.basick.elemk.android.app.bases.BaseApplication
import com.mozhimen.basick.lintk.optin.OptInApiMultiDex_InApplication

/**
 * @ClassName BaseMultiLangApplication
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/12/24 15:53
 * @Version 1.0
 */
@OptIn(OptInApiMultiDex_InApplication::class)
open class BaseMultiLangApplication : BaseApplication() {
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(MultiLanguages.attach(base))
    }

    @CallSuper
    override fun onCreate() {
        super.onCreate()
        MultiLanguages.init(this)
    }
}