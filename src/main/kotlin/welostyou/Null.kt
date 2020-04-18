package welostyou

fun <T> T?.isNotNull(block: (T) -> Unit) {
    if (this != null) block(this)
}