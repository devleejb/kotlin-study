class MyClass {
    companion object {
        var data = 10
        fun some() {
            println(data)
        }
    }
}

// companion object를 이용하면 클래스명을 이용하여 멤버에 접근할 수 있다.
// 자바의 static을 대체한다.
fun main() {
    MyClass.data = 50
    MyClass.some()
}