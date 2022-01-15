package fuction

fun main() {
val isvalidate = isValidate( 5) {
    it > 4
}
    println(isvalidate)
    
    consultProductId(onNext = getOnNextProductIdBehavior())
}
fun isValidate (x: Int, validate: (x:Int) -> Boolean): Boolean = validate(x)

fun consultProductId(onNext: (productId: String) -> Unit) {
    // BD
    // Api
    val productId = "WERT123"
    onNext(productId)
}

fun getOnNextProductIdBehavior(): ((productId: String) -> Unit) {
    return {
        println("Go to Product Detail Screen with product Id: $it")
    }
}