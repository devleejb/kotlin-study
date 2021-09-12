// typealias는 타입의 별칭을 선언하는 키워드이다.
typealias MyFunType = (Int, Int) -> Boolean

val someFun: MyFunType = { no1: Int, no2: Int -> no1 > no2 }