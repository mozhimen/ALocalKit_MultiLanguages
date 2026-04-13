package com.mozhimen.localk.multilang.ui.databinding.bases.viewdatabinding

import android.content.Context
import androidx.databinding.ViewDataBinding
import androidx.viewbinding.ViewBinding
import com.hjq.language.MultiLanguages
import com.mozhimen.uik.databinding.bases.viewbinding.activity.BaseBarActivityVB
import com.mozhimen.uik.databinding.bases.viewdatabinding.activity.BaseBarActivityVDB

/**
 * @ClassName BaseMultiLangBarActivity
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/12/24 15:22
 * @Version 1.0
 */
abstract class BaseMultiLangBarActivityVDB<VDB : ViewDataBinding> : BaseBarActivityVDB<VDB>() {

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(MultiLanguages.attach(newBase))
    }
}