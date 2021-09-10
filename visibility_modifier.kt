// public : 접근 제한이 없음
// internal : 같은 모듈 내에서 접근 가능
// protected : 상속 관계의 하위 클래스에서만 가능
// private : 클래스 내부에서만 이용

open class ParentClass {
    var publicData = 10
    protected var protectedData = 20
    private var privateData = 30
}

class ChildClass: ParentClass() {
    fun subFun() {
        publicData++ // 성공
        protectedData++ // 성공
        // privateData++ // 실패
    }
}

fun main() {
    val obj = ParentClass()

    obj.publicData++ // 성공
    // obj.protectedData++ // 실패
    // obj.privateData++ // 실패
}