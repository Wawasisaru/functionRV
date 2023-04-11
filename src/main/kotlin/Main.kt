fun main() {
    smores()
    getPrice(price = 48.0, couponCode = "save15")
    var tspNeeded = ozToTsp(.75)
    println("You will need $tspNeeded tsp of vanilla extract for this recipe.")
}


//  Q1-Create a function named smores() that outputs the following statements using println():
//"Roast a marshmallow."
//"Place marshmallow on a graham cracker." And invoke it in the fun main
fun smores(){
    println("Roast a marshmallow.")
    println("Place marshmallow on a graham cracker.")
}

//Q1-An online shop has a special coupon code to get 15% off a customer’s final purchase.
////Create a function called getPrice() that accepts a Double type argument named price as well as a
//// String argument called couponCode that has a default value of "None
////inside the function, declare a Double type variable called finalPrice.
////Then, create an if/else expression.
////If the value of couponCode is "save15", set finalPrice to price * .85.
////In the else expression, set finalPrice to price.
fun getPrice(price: Double, couponCode: String = "None"){
    var finalPrice: Double
    if (couponCode == "save15"){
        finalPrice = price * .85
    }else{
        finalPrice = price
    }
    println("The total price is $finalPrice")
}
//Q3//RETURN STATEMENTS
//// Create a function called ozToTsp() that takes a Double type argument named oz and returns a Double type value.
////Inside the function, create a variable tsp whose value is oz multiplied by 6.
//// Use a return statement to return the value of tsp.
fun ozToTsp(oz: Double): Double {
    var tsp = oz * 6
    return tsp

}
