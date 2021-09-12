// Anonymous Function 정의 기법
// { 매개 변수 -> 함수 본문 }
// 변수의 타입을 통해 매개변수의 타입을 유추할 수 있다면, 매개변수의 타입을 생략할 수 있다.
// 함수 본문의 마지막 표현식은 함수의 반환값이다.
// 람다 함수에서는 return문을 사용할 수 없다.

val sum = {no1: Int, no2: Int -> no1 + no2}

// 매개변수가 없는 람다함수
val printHello = { -> println("Hello, Kotlin") }
// 매개변수가 없을 경우 ->를 생략할 수 있다.
val printHello2 = { println("Hello, Kotlin") }

// 매개변수가 1개인 람다 함수는 선언하지 않아도 it 키워드를 이용하여 사용할 수 있다.
// 해당 매개변수의 타입을 식별할 수 있을 때에만 가능하다.
val some: (Int) -> Unit = { println(it) }

// 변수는 타입을 가지며 타입을 유추할 수 있을 때를 제외하고는 생략할 수 없다.
// 그래서 변수에 함수를 대입하려면 변수를 함수 타입으로 선언해야 한다.
// (Int, Int) -> Int 는 Int형 매개변수 2개를 받아서 결괏값을 Int 타입으로 반환하는 함수 타입이다.
val some2: (Int, Int) -> Int = { no1: Int, no2: Int -> no1 + no2 }


fun main() {
    sum(10, 20)
}