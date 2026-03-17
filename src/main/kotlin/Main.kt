import kotlin.math.PI

val regularDiscont = 0.01
val basedDiscont = 100
val discont = 0.05
fun main() {


    while (true) {
        print("Введите свое имя: ")
        var name = readln()
        print("Введите сумму покупки: ")
        var purchase = readln().toInt()
        print("Какая покупка по счету: ")
        var countOfPurchase = readln().toInt()
        calculateDiscount(countOfPurchase, purchase)
    }

}


fun calculateDiscount(countOfPurchase: Int, purchase: Int) {
    if (countOfPurchase > 4) {
        if (purchase >= 0 && purchase <= 1_000) {
            println("Вам будет предоставленна скидка в размере ${purchase * regularDiscont}")
        } else if (purchase >= 1_001 && purchase <= 10_000) {
            var sk = purchase - basedDiscont
            var res = sk * regularDiscont
            println(
                "Вам предоставленна скидка в размере $basedDiscont + доп скидка постоянному покупателю в размере" +
                        " $regularDiscont%. Итоговая сумма: ${sk - res}"
            )
        } else if (purchase >= 10_001) {
            var a = purchase * discont
            var result = purchase - a
            var oneMore = result * regularDiscont
            println(
                "Вам предоставленна скидка в размере $a + скидка постоянного клиента $regularDiscont%." +
                        " Итоговая сумма: ${result - oneMore}"
            )
        }
    } else if (countOfPurchase < 4) {
        if (purchase >= 0 && purchase <= 1_000) {
            println("Скидка не предоставляется за покупку на сумму: $purchase  руб.")
        } else if (purchase >= 1_001 && purchase <= 10_000) {
            println("Вам предоставленна скидка в размере $basedDiscont. Итоговая сумма: ${purchase - basedDiscont}")
        } else if (purchase >= 10_001) {
            var a = purchase * discont
            var result = purchase - a
            println("Вам предоставленна скидка в размере $a. Итоговая сумма: $result")
        }
    }}
