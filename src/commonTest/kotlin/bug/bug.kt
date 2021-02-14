package bug

fun a() {
    b<Int> { _, _ -> 0 }
}

fun <T> b(c: Comparator<in T>) {
}
