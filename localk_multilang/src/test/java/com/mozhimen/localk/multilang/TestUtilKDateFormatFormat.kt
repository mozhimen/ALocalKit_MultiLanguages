package com.mozhimen.localk.multilang

import com.hjq.language.LocaleContract
import com.mozhimen.basick.utilk.java.text.date2strDate
import org.junit.Test
import java.util.Date

/**
 * @ClassName TestUtilKDateFormat
 * @Description TODO
 * @Author mozhimen
 * @Date 2024/8/13
 * @Version 1.0
 */
class TestUtilKDateFormatFormat {
    @Test
    fun date2strDate() {
        val date = Date()
//        println(date.date2strDate(CDateFormat.DEFAULT, LocaleContract.getRussiaLocale()))
//        println(date.date2strDate(CDateFormat.FULL, LocaleContract.getRussiaLocale()))
//        println(date.date2strDate(CDateFormat.LONG, LocaleContract.getRussiaLocale()))
//        println(date.date2strDate(CDateFormat.MEDIUM, LocaleContract.getRussiaLocale()))
//        println(date.date2strDate(CDateFormat.SHORT, LocaleContract.getRussiaLocale()))
//
//        println("//////////////////////////////////////")
//        println(date.date2strDate(CDateFormat.DEFAULT, LocaleContract.getHindiLocale()))
//        println(date.date2strDate(CDateFormat.FULL, LocaleContract.getHindiLocale()))
//        println(date.date2strDate(CDateFormat.LONG, LocaleContract.getHindiLocale()))
//        println(date.date2strDate(CDateFormat.MEDIUM, LocaleContract.getHindiLocale()))
//        println(date.date2strDate(CDateFormat.SHORT, LocaleContract.getHindiLocale()))
//        println(date.date2strDate(CDateFormat.SHORT, LocaleContract.getHindiLocale()))
//        println("//////////////////////////////////////")
//
//        println(date.date2strDate(CDateFormat.DEFAULT, LocaleContract.getVietnameseLocale()))
//        println(date.date2strDate(CDateFormat.FULL, LocaleContract.getVietnameseLocale()))
//        println(date.date2strDate(CDateFormat.LONG, LocaleContract.getVietnameseLocale()))
//        println(date.date2strDate(CDateFormat.MEDIUM, LocaleContract.getVietnameseLocale()))
//        println(date.date2strDate(CDateFormat.SHORT, LocaleContract.getVietnameseLocale()))
//        println("//////////////////////////////////////")

        //MMMMd
        println(date.date2strDate(LocaleContract.getVietnameseLocale(), "MMMMd", false))
        println(date.date2strDate(LocaleContract.getHindiLocale(), "MMMMd", false))
        println(date.date2strDate(LocaleContract.getRussiaLocale(), "MMMMd", false))
        println(date.date2strDate(LocaleContract.getVietnameseLocale(), "MMMMd", true))
        println(date.date2strDate(LocaleContract.getHindiLocale(), "MMMMd", true))
        println(date.date2strDate(LocaleContract.getRussiaLocale(), "MMMMd", true))
    }
}