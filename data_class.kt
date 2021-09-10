class NonDataClass(val name: String, val email: String, val age: Int)

data class DataClass(val name: String, val email: String, val age: Int)

fun main() {
    val non1 = NonDataClass("ljb", "kk@naver", 30)
    val non2 = NonDataClass("ljb", "kk@naver", 30)

    val data1 = DataClass("ljb", "kk@naver", 30)
    val data2 = DataClass("ljb", "kk@naver", 30)

    // Data 클래스의 equals는 객체 자체를 비교하는 일반 클래스의 것과 달리 주 생성자의 매개변수 값을 비교한다.
    // 주 생성자의 매개변수 외의 멤버 변수의 값이 달라도 true를 반환한다.
    println(non1.equals(non2)) // false
    println(data1.equals(data2)) // true

    println(non1.toString()) // 파일의 위치, 객체의 id 값을 출력한다.
    println(data1.toString()) // 주 생성자 매개변수에 선언된 데이터를 출력한다.
}