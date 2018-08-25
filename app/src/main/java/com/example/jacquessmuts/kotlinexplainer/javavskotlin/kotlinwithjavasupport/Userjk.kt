package com.example.jacquessmuts.kotlinexplainer.javavskotlin.kotlinwithjavasupport

/**
 * Created by jacquessmuts on 2018/02/15.
 */

class Userjk
@JvmOverloads constructor (var id: Long,
                           @JvmField var username: String? = "Hello There",
                           var password: String? = "General Kenobi",
                           var type: Type? = Type.GOLDFISH) {

    enum class Type {
        WHALE, DOLPHIN, GOLDFISH
    }
}
