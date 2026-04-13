package com.mozhimen.localk.multilang.ui.databinding.bases.viewdatabinding

import android.content.Context
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import com.hjq.language.MultiLanguages
import com.mozhimen.uik.databinding.bases.viewbinding.activity.BaseSaveStateActivityVBVM
import com.mozhimen.uik.databinding.bases.viewdatabinding.activity.BaseSaveStateActivityVDBVM

/**
 * @ClassName BaseMultiLangSaveStateActivityVBVM
 * @Description TODO
 * @Author mozhimen
 * @Date 2025/5/27
 * @Version 1.0
 */
abstract class BaseMultiLangSaveStateActivityVDBVM<VDB : ViewDataBinding, VM : ViewModel> : BaseSaveStateActivityVDBVM<VDB, VM>() {
    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(MultiLanguages.attach(newBase))
    }
}