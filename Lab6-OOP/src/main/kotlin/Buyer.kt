class Buyer(var sex: String,_name:String,var gipsy:Boolean):Person(_name)
{
    override var age: Int = 0

    override fun setPersonAge(_age: Int) {
        age = _age
    }
    override fun getPersonAge():Int {
        return age
    }
    var walking:Boolean = true
    var number=(0..3).shuffled().last()
    var number1=(0..3).shuffled().last()
    var number2=(0..1).shuffled().last()

    var arrive = true

    var buyers = (10000..50000).shuffled().last()
    var buyers1= (15..100).shuffled().last()


    fun walk()
    {
        println("The Buyer, "+ name +" is waling through supermarket and $sex is $age yars old ")
    }

    fun choose()
    {
        println("The Buyer is choosing the products")
    }

    fun give(product:Int, money:Int)
    {
        println("The Buyer gives " +product+" products " + money+" dollars to Cashier")
        println("THe buyer is looking around to the other shelves near checkout")
    }

}
