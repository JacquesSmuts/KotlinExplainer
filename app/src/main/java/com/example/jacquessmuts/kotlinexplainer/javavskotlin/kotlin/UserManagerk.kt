package com.example.jacquessmuts.kotlinexplainer.javavskotlin.kotlin


class UserManagerk {

    companion object {
        private var instance: UserManagerk? = null
        fun getInstance(): UserManagerk {
            if (instance == null) {
                instance = UserManagerk()
            }

            return instance as UserManagerk
        }
    }


}
