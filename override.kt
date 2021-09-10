open class SuperClass {
    // 멤버 변수 또는 함수가 open 키워드와 함께 선언되어야, 자식 클래스에서 오버라이드 될 수 있다.
    open var data = 10
    open fun someFun() {
        println("I am Super Class : $data")
    }
}

class SubClass: SuperClass() {
    override var data = 20
    override fun someFun() {
        println("I am Sub Class : $data")
    }
}