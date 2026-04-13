package com.mozhimen.localk.multilang.ui.databinding.bases.viewdatabinding

import android.content.Context
import androidx.databinding.ViewDataBinding
import androidx.viewbinding.ViewBinding
import com.hjq.language.MultiLanguages
import com.mozhimen.uik.databinding.bases.viewbinding.activity.BaseActivityVB
import com.mozhimen.uik.databinding.bases.viewdatabinding.activity.BaseActivityVDB

/**
 * @ClassName BaseMultiLangActivityVB
 * @Description TODO
 * @Author mozhimen
 * @Date 2025/5/27
 * @Version 1.0
 */
abstract class BaseMultiLangActivityVDB<VDB : ViewDataBinding> : BaseActivityVDB<VDB>() {
    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(MultiLanguages.attach(newBase))
    }
}