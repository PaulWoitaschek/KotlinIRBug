package bug

fun a() {
    b<Int> { _, _ -> 0 }
}

private fun <T> b(c: Comparator<in T>) {
}
