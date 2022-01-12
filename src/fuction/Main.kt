package fuction

// my fabulous App
//
fun main() {
    val apppName = "My fabulous App"
    val addStartsFormatted = addStartsFormat(apppName, 5)
    println(addStartsFormatted)

    val welcome = "Welcome to the best experience"
    val addStartsFormatted1 = addStartsFormat(welcome, 3)
    println(addStartsFormatted1)

    val name = "dalton celadita"
    val addStartsFormatted2 = addStartsFormat(name, 2)
    println(addStartsFormatted2)

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
