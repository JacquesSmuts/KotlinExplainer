package com.example.jacquessmuts.kotlinexplainer.javavskotlin.kotlinwithjavasupport


class UserManagerjk {

    companion object {

        //do initialization yourself. Works fine enough.
        @JvmStatic
        lateinit var instanceOne: UserManagerjk

        //use Kotlin lazy loading. Much nicer.
        @JvmStatic
        val instance: UserManagerjk by lazy {
            UserManagerjk()
        }

        /**
         * If you need to pass an argument to an INSTANCE declaration, the most threadsafe and
         * byte-code efficient way to do it can be found here:
         * [https://medium.com/@BladeCoder/kotlin-singletons-with-argument-194ef06edd9e]
         */

    }



    init {
        instanceOne = UserManagerjk()
    }

    class AppHelper(){}

}

