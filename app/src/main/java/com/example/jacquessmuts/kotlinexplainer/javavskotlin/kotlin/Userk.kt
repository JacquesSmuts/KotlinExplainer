package com.example.jacquessmuts.kotlinexplainer.javavskotlin.kotlin

/**
 * Created by jacquessmuts on 2018/02/15.
 */

class Userk (var id: Long,
             var username: String? = "Hello There",
             var password: String? = "General Kenobi",
             var type: Type? = Type.GOLDFISH) {

    enum class Type {
        WHALE, DOLPHIN, GOLDFISH
    }
}
