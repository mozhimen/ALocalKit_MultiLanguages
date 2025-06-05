package com.mozhimen.localk.multilang.ui.compose.bases

import android.content.Context
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.annotation.CallSuper
import androidx.compose.runtime.CompositionContext
import com.hjq.language.MultiLanguages
import com.mozhimen.basick.bases.BaseBarActivity
import com.mozhimen.composek.elems.commons.ICompose_Listener
import com.mozhimen.kotlin.utilk.android.util.UtilKLogWrapper
import com.mozhimen.uik.compose.bases.activity.BaseBarActivityCP

/**
 * @ClassName BaseBarActivityCP
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2025/2/2 15:44
 * @Version 1.0
 */
abstract class BaseMultiLangBarActivityCP : BaseBarActivityCP() {
    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(MultiLanguages.attach(newBase))
    }
}