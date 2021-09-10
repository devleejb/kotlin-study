// open 키워드와 함께 선언된 클래스만 상속 가능
open class Super {

}

// Super 클래스를 상속 받으며, 매개변수가 없는 생성자 호출
class Sub: Super() {

}

// 매개변수가 있는 생성자 호출
// class Sub: Super(name)

// 클래스 선언부에서 생성자를 호출하지 않고, 생성자에서 호출
// class Sub: Super {
//     constructor(name: String): super(name) {