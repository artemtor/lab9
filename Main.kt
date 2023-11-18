import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    val shot1 =
        launch {
            for (i in 1 .. 4) {
                delay(1000L)
                print("chk ")
            }
            println("chk = POOF!")
        }
    val shot2 =
        launch {
            for (i in 1 .. 6) {
                delay(1020L)
                print("pick ")
            }
            println("pick = POOF!")
        }
    val shot3 =
        launch {
            for (i in 1 .. 9) {
                delay(1040L)
                println("meow ")
            }
            println("meow = POOF!")
        }
    shot1.join()
    shot2.join()
    shot3.join()
}