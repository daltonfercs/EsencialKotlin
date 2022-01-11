package controlstructure

fun main() {
    val trueUser = "dalton"
    val truePass = "root"
    var loginattempts = 0
    do {
        println("Ingrese el usuario: ")
        val user = readLine()
        println("Ingrese la Contraseña: ")
        val pass = readLine()

        if ((user == trueUser) and (pass == truePass)) {
            println("Bienvenido $user ")
            break

        } else {
            println("Los datos no coinciden ")
            loginattempts++
        }
    } while (loginattempts < 5)
    if (loginattempts == 5) {
        println("Se termino los intentos de logueo")
    }
}