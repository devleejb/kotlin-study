fun main() {
    val data = arrayOf<Int>(10, 20, 30)

    for (i in 1..10) {
        println(i)

        // for (i in 1..10) -> 1부터 10까지 1씩 증가
        // for (i in 1 until 10) -> 1부터 9까지 1씩 증가
        // for (i in 2..10 step 2) -> 2부터 10까지 2씩 증가
        // for (i in 10 downTo 1) -> 10부터 1까지 1씩 감소
    }

    // 컬렉션 타입의 갯수만큼 반복
    for (i in data.indices) {

    }

    // 인덱스와 실제 데이터를 함께 가져옴
    for ((index, value) in data.withIndex()) {

    }
}