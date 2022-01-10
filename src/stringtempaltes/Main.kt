package stringtempaltes

fun main() {
    val price = 15.24
    val igv = 0.18
    val out = "El valor de $price es despues de Impuestos ${price * (1 + igv)}"
    println(out)

    val longitudPulgaMM = 2
    val longitudPulgaCM = longitudPulgaMM.toFloat() / 10
    val salto = 30

    val text = "Si una pulga mide $longitudPulgaMM mm. podría dar un salto de $salto veces la longitud de su cuerpo, es decir: ${salto * longitudPulgaCM} cm."

    println(text)

}