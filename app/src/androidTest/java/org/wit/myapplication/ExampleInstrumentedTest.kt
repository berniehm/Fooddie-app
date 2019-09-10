package org.wit.myapplication

import android.os.Parcel
import android.os.Parcelable
import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 * Created by Bernadette Murphy
 * *This will be an app that counts calories of food to help athletes and dieters
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest() : Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("org.wit.myapplication", appContext.packageName)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ExampleInstrumentedTest> {
        override fun createFromParcel(parcel: Parcel): ExampleInstrumentedTest {
            return ExampleInstrumentedTest(parcel)
        }

        override fun newArray(size: Int): Array<ExampleInstrumentedTest?> {
            return arrayOfNulls(size)
        }
    }
}
