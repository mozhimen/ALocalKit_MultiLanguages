package com.mozhimen.basick.multilang.bases

import android.content.Context
import androidx.databinding.ViewDataBinding
import com.hjq.language.MultiLanguages
import com.mozhimen.basick.elemk.androidx.appcompat.bases.databinding.BaseBarActivityVB

/**
 * @ClassName BaseMultiLangBarActivity
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/12/24 15:22
 * @Version 1.0
 */
abstract class BaseMultiLangBarActivityVB<VB : ViewDataBinding> : BaseBarActivityVB<VB>() {

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(MultiLanguages.attach(newBase))
    }
}