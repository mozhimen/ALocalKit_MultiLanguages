package com.mozhimen.localk.multilang.ui.databinding.bases.viewdatabinding

import android.content.Context
import androidx.databinding.ViewDataBinding
import androidx.viewbinding.ViewBinding
import com.hjq.language.MultiLanguages
import com.mozhimen.uik.databinding.bases.viewbinding.activity.BaseSaveStateActivityVB
import com.mozhimen.uik.databinding.bases.viewdatabinding.activity.BaseSaveStateActivityVDB

/**
 * @ClassName BaseMultiLangSaveStateActivityVB
 * @Description TODO
 * @Author mozhimen
 * @Date 2025/5/27
 * @Version 1.0
 */
class BaseMultiLangSaveStateActivityVDB<VDB : ViewDataBinding>: BaseSaveStateActivityVDB<VDB>() {
    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(MultiLanguages.attach(newBase))
    }
}