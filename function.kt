// Function Declaration
// fun 함수명(매개변수명: 타입): 반환 타입 { ... }
// 반환 타입을 생략하면 Unit 타입이 적용된다.

// 함수의 배개변수에는 var나 val 키워드를 사용할 수 없다.
// val이 자동으로 적용되며 함수 안에서 매겨변수의 값을 변경할 수 없다.
fun some(data1: Int) {
    // data1 = 20 Error!
}
