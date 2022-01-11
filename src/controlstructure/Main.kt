package controlstructure

fun main() {
    val isLoggerIn = true
    val hasAddress = false

    if  (isLoggerIn) {
        println("El usuario esta logeado")
        if (hasAddress) {
            println("Mostrar direcciones de usuario")
        } else {
            println("usuario no tine direcciones")
        }
    } else {
        println("El usuario no esta logeado")
    }

    val userLoggedInStatus = if (isLoggerIn) "logueado" else "no logueado"
    println("Usuario: $userLoggedInStatus")
}