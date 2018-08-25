package com.example.jacquessmuts.kotlinexplainer.javavskotlin.kotlinwithjavasupport

/**
 * Created by jacquessmuts on 2018/02/15.
 * This is one of those legacy files that are a bit of a mess, converted to Kotlin and cleaned up.
 * Convert [com.example.jacquessmuts.kotlinexplainer.javavskotlin.UserJavaLegacy] to kotlin and compare
 */
data class UserLegacyjk
@JvmOverloads constructor(var id: Long,
                          @JvmField var username: String = "Hello There",
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

