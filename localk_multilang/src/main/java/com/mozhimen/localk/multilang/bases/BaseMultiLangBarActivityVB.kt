package com.mozhimen.localk.multilang.bases

import android.content.Context
import androidx.viewbinding.ViewBinding
import com.hjq.language.MultiLanguages
import com.mozhimen.bindk.bases.viewbinding.activity.BaseBarActivityVB

/**
 * @ClassName BaseMultiLangBarActivity
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/12/24 15:22
 * @Version 1.0
 */
abstract class BaseMultiLangBarActivityVB<VB : ViewBinding> : BaseBarActivityVB<VB>() {

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(MultiLanguages.attach(newBase))
    }
}