package com.mozhimen.localk.multilang.ui.databinding.bases.viewbinding

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import com.hjq.language.MultiLanguages
import com.mozhimen.uik.databinding.bases.viewbinding.activity.BaseSaveStateActivityVBVM

/**
 * @ClassName BaseMultiLangSaveStateActivityVBVM
 * @Description TODO
 * @Author mozhimen
 * @Date 2025/5/27
 * @Version 1.0
 */
abstract class BaseMultiLangSaveStateActivityVBVM<VB : ViewBinding, VM : ViewModel> : BaseSaveStateActivityVBVM<VB, VM>() {
    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(MultiLanguages.attach(newBase))
    }
}