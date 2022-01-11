package algorithm
// remover un elemento duplicado de un array ordenado

fun main() {
    //val numbers = intArrayOf(1,1,2)
    //val numbers = intArrayOf(0)
    //val numbers = intArrayOf()
    val numbers = intArrayOf(0,0,1,1,1,2,2,3,3,4)




    if (numbers.size > 1) {
        var j = 1
        for (i in 1 until numbers.size) {
            val left = i - 1
            if (numbers[i] != numbers[left]) {
                numbers[j] = numbers[i]
                j++
            }
        }
        for (k in j until numbers.size) {
            numbers[k] = 0
        }
    }
    println(numbers.toList())
}