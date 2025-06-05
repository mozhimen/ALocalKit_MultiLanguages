package com.mozhimen.localk.multilang.ui.databinding.bases.viewbinding

import android.content.Context
import androidx.viewbinding.ViewBinding
import com.hjq.language.MultiLanguages
import com.mozhimen.kotlin.elemk.androidx.appcompat.bases.BaseSaveStateActivity
import com.mozhimen.uik.databinding.bases.viewbinding.activity.BaseSaveStateActivityVB

/**
 * @ClassName BaseMultiLangSaveStateActivityVB
 * @Description TODO
 * @Author mozhimen
 * @Date 2025/5/27
 * @Version 1.0
 */
abstract class BaseMultiLangSaveStateActivityVB<VB : ViewBinding>:BaseSaveStateActivityVB<VB>() {
    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(MultiLanguages.attach(newBase))
    }
}