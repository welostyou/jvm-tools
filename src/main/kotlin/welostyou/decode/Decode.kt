package welostyou.decode

import java.net.URLDecoder
import java.util.*

val String.base64Decode: String get() = String(Base64.getDecoder().decode(this))

val String.URLDecode: String get() = URLDecoder.decode(this, "UTF-8")
