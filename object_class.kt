// object 클래스는 Anonymous Class를 만들 목적으로 사용된다.
// 클래스를 선언함과 동시에 객체를 생성한다.

val obj = object {
    var data = 10
    fun some() {
        println("data : $data")
    }
}

open class A() {
    open var data = 30
}

// 익명 클래스가 A 클래스를 상속받는다.
val obj2 = object: A() {
    override var data = 40
}

fun main() {
    // obj.data // 코틀린의 최상위 타입인 Any로 취급되어 오류 발생

    obj2.data
}