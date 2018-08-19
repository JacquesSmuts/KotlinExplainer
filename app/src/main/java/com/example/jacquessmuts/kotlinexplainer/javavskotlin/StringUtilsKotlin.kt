package com.example.jacquessmuts.kotlinexplainer.javavskotlin

import java.net.URLEncoder

/**
 * Created by jacquessmuts on 2018/08/18
 * This is an example of a generic utility class contained in most big projects
 */

object StringUtilsKotlin {

    private val LOG_TAG = StringUtilsKotlin::class.java.simpleName

    /**
     * URL encode a string using UTF-8 character encoding.
     *
     * @param value The string to encode.
     * @return The encoded string on success, or an empty string on failure.
     */
    fun urlEncodeStringWithUTF8(value: String): String {
        var encodedValue = ""
        try {
            encodedValue = URLEncoder.encode(value, "UTF-8")
        } catch (e: Exception) {

        }

        return encodedValue
    }


    fun isNonEmpty(s: String?): Boolean {
        return s != null && !s.isEmpty()
    }

    fun isNullOrEmpty(s: String): Boolean {
        return !isNonEmpty(s)
    }

    /**
     * convert to lowercase with _ (underscore) replacing spaces.
     * @param s
     * @return
     */
    fun normalize(s: String?): String? {
        return s?.replace(" ".toRegex(), "_")?.toLowerCase() ?: s
    }

    @JvmStatic
    fun commaSplit(input: String?): Array<String>? {
        return input?.split(",".toRegex())?.dropLastWhile { it.isEmpty() }?.toTypedArray()
    }

    fun nullSafeToLowerCase(input: String): String {
        return if (!isNullOrEmpty(input)) input.toLowerCase() else ""
    }
}
