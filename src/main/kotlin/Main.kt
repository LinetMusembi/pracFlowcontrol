fun main() {
    ageClassifier(13)
    ageClassifier(19)
    childhood(1)
    haveYouBeen("Sudan")
    haveYouBeen("Ethiopia")
    vehicle(8)
    vehicle(2)




}
fun ageClassifier(age:Int){
    if (age in 13..19){
        println("you are a teenager")
    }
    else{
        println("you are not a teenager")
    }
}
//baby 1,toddler 2-3,child,retiree 60
fun childhood(age:Int){
    if (age in 0..1){
        println("you are a baby")
    }
    else if (age in 2..3){
        println("you are a child")
    }
    else if (age in 18..59){
        println("you are an adult")
    }
    else{
        println("you are a retiree")}

}
fun classifier2(age:Int){
    when(age){
        0,1 -> println("you are a baby")
        2,3 -> println("you are a toddler")
    }

}
fun haveYouBeen(nationality:String){
    when(nationality){
        "Kenyan" -> println("Have you been to Nairobi?")
        "Tanzanian" -> println("Have you been to Dodoma?")
        "Rwandan" -> println("Have you been to Kigali?")
        "Ugandan" -> println("Have you been to Kampala?")
        "Sudan" -> println("Have you been to Khartoum?")
        else -> println("have you been to East Africa")
    }
}
fun vehicle(passengers:Int){
    when(passengers){
        2 -> println("coupe")
        4,5-> println("Sedan")
        6,7 -> println("Wagon")
        else -> println("other")
    }

}
fun numbers(nums:Array<Int>){


}



