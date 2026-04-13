package com.mozhimen.localk.multilang.ui.compose.bases

import android.content.Context
import androidx.annotation.CallSuper
import androidx.lifecycle.ViewModel
import com.hjq.language.MultiLanguages
import com.mozhimen.kotlin.utilk.androidx.lifecycle.UtilKViewModel
import com.mozhimen.uik.compose.bases.activity.BaseActivityCPVM
import com.mozhimen.uik.compose.commons.IComposeVM

/**
 * @ClassName BaseActivityCPVM
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2025/2/2 16:53
 * @Version 1.0
 */
abstract class BaseMultiLangActivityCPVM<VM : ViewModel> : BaseActivityCPVM<VM>() {
    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(MultiLanguages.attach(newBase))
    }
}