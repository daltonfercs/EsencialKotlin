package controlstructure

fun main() {

    do {
        println("Ingrese la temperatura en grados centigrados: ")
        var temperature = readLine()!!.toInt()

        val statusTemperature = when  {
            temperature <= 20 -> "Usa un Abrigo hace frío"
            temperature in 21..30 -> "Te irá bien si usas una Chaqueta, el clima es templado"
            else -> "Es mejor que lleves algo ligero, hace calor"
        }
        println(statusTemperature)
        println("desea terminar precione cualquier tecla caso contrario precione s o S")
        var endProgram = readLine()
    }while ((endProgram == "s") or (endProgram == "S"))
}