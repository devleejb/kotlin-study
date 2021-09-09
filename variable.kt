// 변수 선언
// val(or var) 변수명: 타입 = 값
// val은 value의 줄임말로, 초깃값이 할당된 이후 값을 바꿀 수 없다.
// var은 variable의 줄임말로, 초깃값이 할당된 이후 값을 바꿀 수 있다.

// 최상위에 선언한 변수나 클래스의 멤버 변수는 선언과 동시에 초깃값을 할당해야 한다.
val data1: Int = 10
// 10을 대입하여 자동적으로 Type Inference
var data2 = 10

// 최상위에 선언한 변수를 선언과 동시에 초기화하지 않기 위해서는 ,lateinit 또는 lazy 키워드를 이용한다.
// lateinit은 var로 선언한 변수에만 사용할 수 있다.
// Int, Long, Short, Double, Float, Boolean, Byte 타입에는 사용할 수 없다.
lateinit var data3: String

// 소스에서 변수가 최초로 이용되는 순간 중괄호로 묶은 부분이 자동으로 실행되어 그 결괏값이 변수의 초깃값으로 할당된다.
val data4: Int by lazy {
    println("in Lazy...")
    10
}

fun main() {
    // data1 = 20 Error!
    data2 = 20
}