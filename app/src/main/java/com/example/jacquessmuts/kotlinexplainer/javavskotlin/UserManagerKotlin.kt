package com.example.jacquessmuts.kotlinexplainer.javavskotlin


class UserManagerKotlin {

    companion object {
        private var instance: UserManagerKotlin? = null
        fun getInstance(): UserManagerKotlin {
            if (instance == null) {
                instance = UserManagerKotlin()
            }

            return instance as UserManagerKotlin
        }
    }


}
