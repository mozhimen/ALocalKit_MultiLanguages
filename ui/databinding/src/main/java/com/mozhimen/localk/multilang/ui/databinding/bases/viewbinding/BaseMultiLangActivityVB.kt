package com.mozhimen.localk.multilang.ui.databinding.bases.viewbinding

import android.content.Context
import androidx.viewbinding.ViewBinding
import com.hjq.language.MultiLanguages
import com.mozhimen.uik.databinding.bases.viewbinding.activity.BaseActivityVB

/**
 * @ClassName BaseMultiLangActivityVB
 * @Description TODO
 * @Author mozhimen
 * @Date 2025/5/27
 * @Version 1.0
 */
abstract class BaseMultiLangActivityVB<VB : ViewBinding> : BaseActivityVB<VB>() {
    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(MultiLanguages.attach(newBase))
    }
}