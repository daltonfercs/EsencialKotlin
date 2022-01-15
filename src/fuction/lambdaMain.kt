package fuction

fun main() {
    val printHola = {
        println("hola lambda")
    }
    printHola()

    val printText = { text:String ->
        println(text)

    }
    printText("hola Lambda")

    val addOneTo = {x:Int ->
        x+1

    }
    println(addOneTo(4))

    val addFiveTo: (Int) -> Int = {
        it + 5
    }
    println(addFiveTo(1))

    val sum :(Int, Int, String) -> Int = { x: Int, y: Int, _: String ->
        x + y
    }
    println(sum(2,8,""))

    val sum1 : (Int, Int, String) -> Int = {x: Int, y: Int, message: String ->
        val total = x + y
        println("$message $total")
        total
    }
    println(sum1(2,4,"el resultado es"))
}