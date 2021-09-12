fun main() {
    var str1: String = "LJB" // Not Null
    // str1 = null 오류!

    var str2: String? = "LJB" // Nullable
    str2 = null

    // Safe Call : ?.
    // Nullable 타입 변수 멤버에 접근하려면 ?. 연산자를 이용하여야한다.
    // 변수가 null인 경우 null을 반환하고, 그렇지 않으면 변수 멤버 접근 결과를 반환한다.
    var result = str2?.length

    // Elvis Operator : ?:
    // 객체의 값이 null이면 오른쪽 값을 반환하고, 그렇지 않다면 객체의 값을 반환한다.
    println("data = $str2 : ${str2?.length?:-1}") // -1

    // !! Operator
    // 객체가 null일 때, NPE를 발생시킨다.
    // var result2 = (str2!!).length NPE!!
}
