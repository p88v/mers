fun main(){

    val commissions = 0.0075
    val amount = 1_000_000
    val baseCommissions = 35

    val result = amount * commissions

    if(result < 35){
        println("Ваша комиссия составит: $baseCommissions")
    } else print("Ваша комиссия: $result")


}
