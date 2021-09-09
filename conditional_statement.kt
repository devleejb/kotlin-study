// 코틀린에서의 if else문은 결괏값을 반환하는 계산식으로 사용할 수 있다.
// 여러 줄로 코드를 작성하더라도 마지막 줄의 실행 결과만 반환한다.
fun expression() {
    var data = 10

    val result = if (data > 0) {
        true
    } else {
        false
    }
}

// 조건문 when
// when문도 if문과 마찬가지로 표현식으로 활용할 수 있다. 이 때에도 else 부분이 존재하여야 한다.
fun conditionalWhen() {
    var data = 10

    when (data) {
        10 -> println("hello")
        20 -> println("world")
    }

    // 데이터를 명시하지 않고, 조건만 명시할 수 있다.
    when {
        data == 10 -> println("world")
        data == 20 -> println("hello")
      }
}