package com.mozhimen.localk.multilang.ui.compose.bases

import android.content.Context
import androidx.annotation.CallSuper
import androidx.lifecycle.ViewModel
import com.hjq.language.MultiLanguages
import com.mozhimen.kotlin.utilk.androidx.lifecycle.UtilKViewModel
import com.mozhimen.uik.compose.bases.activity.BaseSaveStateActivityCPVM
import com.mozhimen.uik.compose.commons.IComposeVM

/**
 * @ClassName BaseSaveStateActivityCPVM
 * @Description TODO
 * @Author mozhimen
 * @Date 2025/4/17
 * @Version 1.0
 */
abstract class BaseMultiLangSaveStateActivityCPVM<VM : ViewModel> : BaseSaveStateActivityCPVM<VM>() {
    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(MultiLanguages.attach(newBase))
    }
}