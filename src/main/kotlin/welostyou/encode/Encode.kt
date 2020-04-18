package welostyou.encode

import java.net.URLEncoder
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import java.util.*

val String.base64Encode: String get() = Base64.getEncoder().encodeToString(this.toByteArray())

val String.URLEncode: String get() = URLEncoder.encode(this, "UTF-8")

val String.MD5: String?
    get() = try {
        val instance: MessageDigest = MessageDigest.getInstance("MD5")
        val digest: ByteArray = instance.digest(this.toByteArray())
        val sb = StringBuffer()
        for (b in digest) {
            val i: Int = b.toInt() and 0xff
            var hexString = Integer.toHexString(i)
            if (hexString.length < 2) {
                hexString = "0$hexString"
            }
            sb.append(hexString)
        }
        sb.toString()
    } catch (e: NoSuchAlgorithmException) {
        e.printStackTrace()
        null
    }

fun main() {
    println("hello".MD5)
}