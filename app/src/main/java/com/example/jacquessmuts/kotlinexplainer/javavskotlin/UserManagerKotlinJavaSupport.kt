package com.example.jacquessmuts.kotlinexplainer.javavskotlin


class UserManagerKotlinJavaSupport {

    companion object {
        @JvmStatic
        val instance: UserManagerKotlinJavaSupport by lazy {
            UserManagerKotlinJavaSupport()
        }
    }

}
