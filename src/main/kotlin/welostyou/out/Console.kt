package welostyou.out

fun <T> T.print(): T = this.apply { print(this) }

fun <T> T.println(): T = this.apply { println(this) }
