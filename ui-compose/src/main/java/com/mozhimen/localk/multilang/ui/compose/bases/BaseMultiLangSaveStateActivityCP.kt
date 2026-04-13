package com.mozhimen.localk.multilang.ui.compose.bases

import android.content.Context
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.annotation.CallSuper
import androidx.compose.runtime.CompositionContext
import com.hjq.language.MultiLanguages
import com.mozhimen.composek.elems.commons.ICompose_Listener
import com.mozhimen.kotlin.elemk.androidx.appcompat.bases.BaseSaveStateActivity
import com.mozhimen.kotlin.elemk.androidx.appcompat.commons.IActivity
import com.mozhimen.uik.compose.bases.activity.BaseSaveStateActivityCP

/**
 * @ClassName BaseSaveStateActivityCP
 * @Description TODO
 * @Author mozhimen
 * @Date 2025/4/17
 * @Version 1.0
 */
abstract class BaseMultiLangSaveStateActivityCP : BaseSaveStateActivityCP() {
    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(MultiLanguages.attach(newBase))
    }
}