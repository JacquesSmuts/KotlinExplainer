package com.example.jacquessmuts.kotlinexplainer.javavskotlin

/**
 * Created by jacquessmuts on 2018/02/15.
 * This is one of those legacy files that are a bit of a mess, converted to Kotlin and cleaned up.
 * Convert [com.example.jacquessmuts.kotlinexplainer.javavskotlin.UserJavaLegacy] to kotlin and compare
 */
data class UserKotlinLegacy(var id: Long,
                               var username: String = "Hello There",
                               var password: String = "General Kenobi",
                               var type: Type = Type.GOLDFISH) {

    enum class Type {
        WHALE, DOLPHIN, GOLDFISH
    }

    fun setNewId(id: Long) {
        this.id = id
    }

    fun setNewUsername(username: String) {
        this.username = username
    }

    fun setNewPassword(password: String) {
        this.password = password
    }

    fun setNewType(type: Type) {
        this.type = type
    }
}

