package com.mozhimen.localk.multilang

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.hjq.language.LocaleContract
import com.mozhimen.basick.elemk.java.util.cons.CDateFormat
import com.mozhimen.basick.utilk.java.text.date2strDate

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import java.util.Date

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
//        assertEquals("com.mozhimen.basicsk.test", appContext.packageName)
        val date = Date()
        println(date.date2strDate(appContext, CDateFormat.LONG))
        println(date.date2strDate(appContext, CDateFormat.MEDIUM))
        println(date.date2strDate(appContext, CDateFormat.SHORT))
        println("//////////////////////////////////////")
    }
}