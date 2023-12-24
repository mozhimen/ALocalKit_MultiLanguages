package com.mozhimen.basick.multilang.bases

import android.content.Context
import com.hjq.language.MultiLanguages
import com.mozhimen.basick.elemk.androidx.appcompat.bases.BaseBarActivity

/**
 * @ClassName BaseMultiLangBarActivity
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/12/24 15:22
 * @Version 1.0
 */
abstract class BaseMultiLangBarActivity : BaseBarActivity() {

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(MultiLanguages.attach(newBase))
    }
}