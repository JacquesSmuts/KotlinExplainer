package com.example.jacquessmuts.kotlinexplainer.javavskotlin


class UserManagerKotlinJavaSupport {

    companion object {

        lateinit var instanceB: UserManagerKotlinJavaSupport

        @JvmStatic
        val instance: UserManagerKotlinJavaSupport by lazy {
            UserManagerKotlinJavaSupport()
        }

    }

}
