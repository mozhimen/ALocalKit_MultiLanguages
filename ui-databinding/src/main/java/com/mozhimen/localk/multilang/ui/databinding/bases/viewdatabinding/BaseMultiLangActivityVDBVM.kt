package com.mozhimen.localk.multilang.ui.databinding.bases.viewdatabinding

import android.content.Context
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import com.hjq.language.MultiLanguages
import com.mozhimen.uik.databinding.bases.viewbinding.activity.BaseActivityVBVM
import com.mozhimen.uik.databinding.bases.viewdatabinding.activity.BaseActivityVDBVM

/**
 * @ClassName BaseMultiLangActivityVBVM
 * @Description TODO
 * @Author mozhimen
 * @Date 2025/5/27
 * @Version 1.0
 */
abstract class BaseMultiLangActivityVDBVM<VDB : ViewDataBinding, VM : ViewModel> : BaseActivityVDBVM<VDB, VM>() {
    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(MultiLanguages.attach(newBase))
    }
}