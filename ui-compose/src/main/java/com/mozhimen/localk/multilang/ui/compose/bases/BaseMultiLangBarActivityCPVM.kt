package com.mozhimen.localk.multilang.ui.compose.bases

import android.content.Context
import androidx.annotation.CallSuper
import androidx.lifecycle.ViewModel
import com.hjq.language.MultiLanguages
import com.mozhimen.kotlin.utilk.androidx.lifecycle.UtilKViewModel
import com.mozhimen.uik.compose.bases.activity.BaseBarActivityCPVM
import com.mozhimen.uik.compose.commons.IComposeVM

/**
 * @ClassName BaseBarActivityVPVM
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2025/2/2 16:48
 * @Version 1.0
 */
abstract class BaseMultiLangBarActivityCPVM<VM : ViewModel> : BaseBarActivityCPVM<VM>() {
    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(MultiLanguages.attach(newBase))
    }
}