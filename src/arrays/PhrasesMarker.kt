package arrays

fun main() {
    val greetings = arrayOf("hola", "Hi", "Hello", "bienvedido","hallo")
    val introductions = arrayOf("Mi nombre es: ", "Usualmente me llaman ", "Yo soy")
    val names = arrayOf("dalton ", "daltonfercs ", "tom ", "eliot ", "tom ")
    val randNumberGreeting = (Math.random()  * greetings.size).toInt()
    val randNumberIntroductions = (Math.random()  * introductions.size).toInt()
    val randNumberNames = (Math.random()  * names.size).toInt()
    val pharse = "${greetings[randNumberGreeting]} ${introductions[randNumberIntroductions]} " +
            "${names[randNumberNames]}"
    println(pharse)
}