package com.sampson.kotlinuitests

import android.app.Application
import android.content.Context
import androidx.test.runner.AndroidJUnitRunner
import kotlin.jvm.Throws

class MyApplicationTestRunner : AndroidJUnitRunner(){
    @Throws(Exception::class)
    override fun newApplication(
        cl: ClassLoader?,
        className: String?,
        context: Context?
    ): Application {
        return super.newApplication(cl, TestMyApplication::class.java.name, context)
    }
}