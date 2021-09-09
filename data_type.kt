import java.lang.Exception

// Data Type
// 코틀린의 모든 변수는 객체이다.

fun nullAssignment() {
    var data1: Int = 10 // not null
    var data2: Int? = null // 코틀린의 모든 변수는 객체이기 때문에 null 대입이 가능하다.(단, nullable 타입인 경우)
}

fun main() {
    // 정수를 표현하는 Int, Short, Long
    val a1: Int = 12345
    val a2: Short = 123
    val a3: Long = 10L

    // 2진수를 표현하는 Byte
    val a4: Byte = 0b00001011

    // true나 false를 표현하는 Boolean
    val a5: Boolean = true

    // 문자를 표현하는 Char
    // Number 타입으로는 표현할 수 없다.
    val a6: Char = 'a'

    // 문자열을 표현하는 String
    // """을 이용하면 문자열을 이스케이프 문자 필요없이 표현할 수 있다.
    val a7: String = "Hello\nWorld"
    val a8: String = """Hello
        World
    """.trimMargin()

    // String Template
    val name: String = "LJB"
    println("My name is $name")

    // 코틀린의 최상위 클래스 Any
    val a9: Any = 10

    // 반환문이 없는 함수를 나타내는 Unit
    // Unit을 생략하여도 자동으로 Unit이 적용된다.
    fun some(): Unit {

    }

    // null이나 예외를 반환하는 함수를 나타내는 Nothing
    val a10: Nothing? = null

    fun some1(): Nothing? {
        return null
    }

    fun some2(): Nothing {
        throw Exception()
    }
}