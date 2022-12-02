class Cashier(_name:String):Person(_name)
{
    override var age: Int = 0

    override fun setPersonAge(_age: Int) {
        age = _age
    }
    override fun getPersonAge():Int {
        return age
    }
    var number1=(0..2).shuffled().last()
    var number2=(0..1).shuffled().last()
    var money=(3000..20000).shuffled().last()
    var money1=(300000..1000000).shuffled().last()
    var money2 =(100000..500000).shuffled().last()

    var arrive = true


    fun scan()
    {
        println("This Cashier named "+ name +" just scanned buyers Products!")
    }

    fun collectMoney()
    {
        println("This Cashier collected your Money")
    }

    fun give()
    {
        println("This Cashier gave buyer the receipt, change and a bag")
        println("She said 'Goodbye' to the buyer")
        println("She smiled at him")
    }
    fun nameC()
    {
        println("The cashier name is $name and she is $age years old")
    }
}