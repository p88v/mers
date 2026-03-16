fun main() {
    val likes = 21

    val lastNumber = likes % 10

    if(lastNumber == 1 && likes != 11){
        println("Понравилось $likes человеку")
    } else if(lastNumber != 1){
        println("Понравилось $likes людям")
    } else if(likes == 11){
        println("Понравилось $likes людям")
    }

}