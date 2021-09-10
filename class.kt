class User {
    var name = "ljb"

    // constructor 키워드를 이용하여 생성자를 선언한다.
    // Secondary Constructor
    constructor(name: String) {
        this.name = name
    }
}

// Primary Constructor
// 주생성자의 매개변수에 val 또는 var를 지정해주면, 멤버 변수로 사용할 수 있다.
// class User2(var name:  String)
class User2(name: String) {
    var name: String

    // 주 생성자의 본문 구현
    init {
        this.name = name
    }
}

// 주 생성자와 보조 생성자가 동시에 있을 경우, 보조 생성자에서 주 생성자를 반드시 호출하여야 한다.
class User3(var name: String) {
    var age: Int

    init {
        this.name = name
        this.age = 0
    }

    // this()를 이용한 주 생성자 호출
    // 공통된 부분을 주 생성자에 작성하라는 의도
    constructor(name: String, age: Int): this(name) {
        this.age = age
    }
}

fun main() {
    // new 키워드를 적지 않는다.
    val user = User("LeeJongBeom")
}