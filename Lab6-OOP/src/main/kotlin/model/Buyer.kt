package model

class Buyer(name:String): Person(name)
{
    override var age: Int = 0

    override fun setPersonAge(age: Int) {
        this.age = age
    }
    override fun getPersonAge():Int {
        return age
    }
    var number=(0..3).shuffled().last()
    var number1=(0..3).shuffled().last()
    var number2=(0..1).shuffled().last()
    var buyers = (10000..50000).shuffled().last()
    var buyers1= (15..100).shuffled().last()


    fun choose()
    {
        println("Buyer is choosing the products")
    }

    fun give(product:Int, money:Int)
    {
        println("Buyer gives $product products $money dollars to model.Cashier")
        println("The buyer is looking around to the other shelves near checkout")
    }

}
