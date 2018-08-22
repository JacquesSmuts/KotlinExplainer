package com.example.jacquessmuts.kotlinexplainer.javavskotlin

import android.app.Application


class UserManagerKotlinJavaSupport {

    companion object {

        //do initialization yourself. Works fine enough.
        @JvmStatic
        lateinit var instanceOne: UserManagerKotlinJavaSupport

        //use Kotlin lazy loading. Much nicer.
        @JvmStatic
        val instance: UserManagerKotlinJavaSupport by lazy {
            UserManagerKotlinJavaSupport()
        }

        /**
         * If you need to pass an argument to an instance declaration, the most threadsafe and
         * byte-code efficient way to do it can be found here:
         * [https://medium.com/@BladeCoder/kotlin-singletons-with-argument-194ef06edd9e]
         */

    }



    init {
        instanceOne = UserManagerKotlinJavaSupport()
    }

    class AppHelper(){}

}

