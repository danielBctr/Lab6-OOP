open class Truck()
{
     var products1 = (250..500).shuffled().last()
     var number=(0..1).shuffled().last()

    fun arrive()
    {
        println("The Truck arrived at the store, the products number is $products1")
    }

    fun left()
    {
        println("The Truck left.")
    }

}