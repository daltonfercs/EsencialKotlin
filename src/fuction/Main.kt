package fuction

// my fabulous App
//
fun main() {
    val apppName = "My fabulous App"
    val addStartsFormatted = addStartsFormat(apppName, 5)
    println(addStartsFormatted)

    val welcome = "Welcome to the best experience"
    println(addStartsFormat(welcome, 3))

    val name = "dalton celadita"
    println(addStartsFormat(name, 2))

    println(addStartsFormat(name))

}

fun addStartsFormat(text: String, startNumber: Int ): String{
    val textBuilder = StringBuilder(text)

    textBuilder.insert(0," ")
    textBuilder.insert(textBuilder.length," ")
    for (i in 0 until startNumber) {
        textBuilder.insert(0,"*")
        textBuilder.insert(textBuilder.length, "*")
    }
    return textBuilder.toString()
}

fun addStartsFormat(text: String): String = addStartsFormat(text, 2)
