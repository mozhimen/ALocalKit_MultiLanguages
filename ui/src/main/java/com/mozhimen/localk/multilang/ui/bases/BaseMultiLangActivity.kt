package com.mozhimen.localk.multilang.ui.bases

import android.content.Context
import com.hjq.language.MultiLanguages
import com.mozhimen.kotlin.elemk.androidx.appcompat.bases.BaseActivity

/**
 * @ClassName BaseMultiLangBarActivity
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/12/24 15:22
 * @Version 1.0
 */
abstract class BaseMultiLangActivity : BaseActivity() {
    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(MultiLanguages.attach(newBase))
    }
}