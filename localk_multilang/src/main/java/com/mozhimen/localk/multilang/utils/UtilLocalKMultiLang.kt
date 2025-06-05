package com.mozhimen.localk.multilang.utils

import android.content.Context
import com.hjq.language.LocaleContract
import com.hjq.language.MultiLanguages
import com.mozhimen.stackk.callback.StackKCb
import java.util.Locale

/**
 * @ClassName UtilLocalKMultiLang
 * @Description TODO
 * @Author mozhimen
 * @Date 2025/5/27
 * @Version 1.0
 */
object UtilLocalKMultiLang {
    /*    vdb.btnLangEs.applyDebounceClickListener(lifecycleScope){
            vm.propLang = getString(R.string.str_es)
            val restart = MultiLanguages.setAppLanguage(this, LocaleContract.getSpainLocale())
            if (restart) restartStack()
        }

        @OptIn(OApiInit_InApplication::class)
        private fun restartStack() {
            ApiFactory.netKOkhttp3Cache.removeAll()
            StackKCb.instance.finishAllInvisibleActivity()
            */
    /**
     *         context.startContext<MainActivity> {
     *             addFlags(CIntent.FLAG_ACTIVITY_NEW_TASK or CIntent.FLAG_ACTIVITY_CLEAR_TASK)
     *         }
     *//*
        overridePendingTransition(com.ty.lelejoy.common.R.anim.anim_alpha_show, com.ty.lelejoy.common.R.anim.anim_alpha_hide)
        finish()
    }*/

    @JvmStatic
    fun getLanguagesAbbr(context: Context? = null): String {
        val locale = if (context != null) {
            MultiLanguages.getAppLanguage(context)
        } else {
            MultiLanguages.getAppLanguage()
        }
        return when {
            locale == LocaleContract.getTraditionalChineseLocale()
                    || locale == Locale.TRADITIONAL_CHINESE
                    || (locale.toString().contains("tw", false) && locale.toString().contains("zh", false)) -> "zh-tw"

            locale == LocaleContract.getChineseLocale()
                    || locale == LocaleContract.getSimplifiedChineseLocale()
                    || locale == Locale.CHINESE
                    || locale == Locale.CHINA
                    || locale == Locale.SIMPLIFIED_CHINESE
                    || (locale.toString().contains("cn", false) && locale.toString().contains("zh", false))
                    || locale.toString().contains("zh", false) -> "zh-cn"

            locale == LocaleContract.getHindiLocale() -> "hi"

            locale == LocaleContract.getRussiaLocale() -> "ru"

            locale == LocaleContract.getThailandLocale() -> "th"

            locale == LocaleContract.getVietnameseLocale() -> "vi"

            locale == LocaleContract.getFilipinoLocale() -> "tl"

            locale == LocaleContract.getMalayLocale() -> "ms"

            locale == LocaleContract.getBurmeseLocale() -> "my"

            locale == LocaleContract.getIndonesiaLocale() -> "id"

            locale == LocaleContract.getSpainLocale() -> "es"

            locale == LocaleContract.getFrenchLocale() -> "fr"

            locale == LocaleContract.getItalianLocale() -> "it"

            locale == LocaleContract.getSpainLocale() -> "es"

            locale == LocaleContract.getPortugalLocale() -> "pt"

            locale == LocaleContract.getJapaneseLocale() -> "ja"

            locale == LocaleContract.getGermanLocale() -> "de"
            else -> "en"
        }
    }
}