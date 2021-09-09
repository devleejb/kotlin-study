// 컬렉션 타입이란 여러 개의 데이터를 표현하는 방법이며 Array, List, set, Map이 있다.
// 생성자 : <init>(size: Int, init: (Int) -> T)

fun array() {
    val arr: Array<Int> = Array(3, { 0 })

    arr[0] = 10
    arr[1] = 20
    arr.set(2, 30)

    // arrayOf 함수를 이용하여 선언과 동시에 값을 할당할 수 있다.
    val arr2 = arrayOf(10, 20, 30)

    // 배열의 타입을 제네릭으로 명시하지 않고, 배열의 데이터가 기초 타입이라면 각 기초 타입의 배열을 나타내는 클래스를 사용할 수 있다.
    // BooleanArray, ByteArray ...
    val arr3 = intArrayOf(10, 20, 30)
}


// Collection 타입의 클래스는 mutable 클래스와 immutable 클래스로 나뉜다.
// List : 순서가 있는 데이터 집합으로 데이터의 중복을 허용한다. -> listOf(), mutableListOf()
// Set : 순서가 없으며 데이터의 중복을 허용하지 않는다. -> setOf(), mutableSetOf()
// Map : 키와 값으로 이루어진 데이터 집합으로 순서가 없으며 키의 중복은 허용하지 않는다. -> mapOf(), mutableSetOf()
fun ListSetMap() {
    var list = listOf<Int>(10, 20, 30) // add, set 함수를 이용할 수 없다.
    var map = mapOf<String, String>(Pair("one", "two"), "two" to "world")
}