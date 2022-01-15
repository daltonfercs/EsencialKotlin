package fuction

fun main() {
    val user = "Dalton"
    showWelcomeMessage("hi")
    showWelcomeMessage("hello")
    showWelcomeMessage("Buenos Dias")
    showWelcomeMessage("hola", user)
}
fun showWelcomeMessage(text: String,user: String = "") {
    val message = "$text $user".trim()
    println(message)

}