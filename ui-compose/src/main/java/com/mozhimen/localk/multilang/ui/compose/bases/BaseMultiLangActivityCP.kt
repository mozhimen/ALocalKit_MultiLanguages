package com.mozhimen.localk.multilang.ui.compose.bases

import android.content.Context
import com.hjq.language.MultiLanguages
import com.mozhimen.uik.compose.bases.activity.BaseActivityCP

/**
 * @ClassName BaseActivityCP
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2025/2/2 16:51
 * @Version 1.0
 */
abstract class BaseMultiLangActivityCP : BaseActivityCP() {
    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(MultiLanguages.attach(newBase))
    }
}