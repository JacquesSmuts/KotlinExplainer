package com.example.jacquessmuts.kotlinexplainer.javavskotlin


class UserManagerKotlin {

    private var instance: UserManagerKotlin? = null

    fun getInstance(): UserManagerKotlin {
        if (instance == null) {
            instance = UserManagerKotlin()
        }

        return instance as UserManagerKotlin
    }

}
