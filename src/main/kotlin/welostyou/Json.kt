package welostyou

import com.beust.klaxon.Klaxon

inline fun <reified T> String.toJson() = Klaxon().parse<T>(this)

inline fun <reified T> String.toJsonArray() = Klaxon().parseArray<T>(this)

val Any.jsonString: String?
    get() = try {
        Klaxon().toJsonString(this)
    } catch (e: Exception) {
        null
    }
