package model

class Cashier(name:String): Person(name)
{
    override var age: Int = 0

    override fun setPersonAge(age: Int) {
        this.age = age
    }
    override fun getPersonAge():Int {
        return age
    }
    var number1=(0..2).shuffled().last()
    var number2=(0..1).shuffled().last()
    var money=(3000..20000).shuffled().last()
    var money1=(300000..1000000).shuffled().last()
    var money2 =(100000..500000).shuffled().last()

    fun give()
    {
        println("This Cashier gave buyer the receipt, change and a bag")
        println("She said 'Goodbye' to the buyer")
        println("She smiled at him")
    }
}