
class Products()
{
    var number = (250..500).shuffled().last()
    var number1 = (80000..100000).shuffled().last()

}

class ShoppingCart()
{
    private var Action: Boolean = true

    var number = 50
}


fun main(args: Array<String>) {

    val cashier1 = Cashier("Ana")
    var age:Int

    cashier1.setPersonAge(21)
    age = cashier1.getPersonAge()
    cashier1.nameC()
    println("")

    val buyer1 = Buyer("he", "Alex",true)

    buyer1.setPersonAge(18)
    age = buyer1.getPersonAge()

    buyer1.getPersonName()

    println("")
    val guard1 = SecurityGuard(true,true,true,"P250","James")
    guard1.setPersonAge(54)
    age = guard1.getPersonAge()
    println("")
    guard1.nameG()

    val product = Products()


    val cart = ShoppingCart()
    cart.number

  fun simulation()
    {

        var j = 1

        while(true)
        {
            var dayCount = 1

            while(dayCount <= 30) {
                println("\tDay Number: $dayCount")
                val truck1 = Truck()
                val cashier2 = Cashier("Ana")
                val cashier3 = Cashier("Tania")
                val buyer2 = Buyer("he", "Alex",true)
                val buyer3 =Buyer("she", "Mihaela",true)

                val product1 = Products()

                val guard2 = SecurityGuard(true,true,true,"P250","James")

                println("  It's 7:00 AM")
                if(cashier2.number1 == 1 || cashier2.number1 == 0)
                {
                    println("Cashier ${cashier2.name} came to work and Entered the building through the Main door")
                    println("${cashier3.name} the cashier came to work too")

                }
                else if (cashier2.number1 == 2)
                {
                    println("Cashier ${cashier2.name} it's 5 minutes late and she entered trough back door.")
                    println("${cashier3.name} met ${cashier2.name} and they both entered the store.")
                }


                if(truck1.products1 >= 250 && truck1.products1 <= 500)
                {
                    truck1.arrive()
                    println("The Products are put into the Store by ${cashier2.name} ${cashier3.name}")
                    if(truck1.number == 1)
                    {
                        truck1.left()
                    }
                    else if(truck1.number == 0)
                    {
                        println("The Driver stayed for 10 more minutes to drink a coffee with ${cashier2.name} and ${cashier3.name} ")
                        truck1.left()
                    }
                }
                else
                {
                    println("Something went wrong")
                }
                println("  It's 8:00 AM the Supermarket has opened")

                if(buyer2.number == 1 || buyer2.number== 0)
                {
                    println("The Buyer entered the store")
                    println("Buyer Put his stuff in the closet and took a Shopping cart from the ${cart.number} that there are")
                    println("Client is walking trough the store")
                    println("Another Buyer entered the store...")
                }
                else if(buyer2.number == 2)
                {
                    println("First Client entered the store")
                    println("He just said 'Hello' to the workers and took a Shopping cart")
                    println("Another client entered the store")
                    println("A family entered the store")
                }
                else if(buyer2.number == 3)
                {
                    println("Some kids entered the store")
                    println("They went straight to the Ice-Cream")
                    println("A grandma entered the store")
                    println("A family entered the store")
                }

                if(buyer3.number ==1 || buyer3.number ==0)
                {
                    buyer3.choose()
                    println("Client is looking at all products")
                    println("he took some snacks, coke")
                    println("buyer is walking to the meat section")
                    if(buyer3.number1 ==0)
                    {
                        println("He took some chicken breast")
                    }
                    else if(buyer3.number1 == 1)
                    {
                        println("He took some beef")
                    }
                    else if(buyer3.number1 == 2)
                    {
                        println("He took some pork")
                    }
                    else if(buyer3.number1 == 3)
                    {
                        println("He didn't take anything")
                    }
                }
                else if(buyer3.number == 2 || buyer3.number ==3)
                {
                    buyer3.choose()
                    println("Client is looking at all products")
                    println("he took some fruits")
                    println("buyer is walking to the vegetables section")
                    if(buyer3.number1 ==0)
                    {
                        println("He took some carrots, onions")
                    }
                    else if(buyer3.number1 == 1)
                    {
                        println("He took some potatoes, tomatoes")
                    }
                    else if(buyer3.number1 == 2)
                    {
                        println("He took some broccoli, cabbage")
                    }
                    else if(buyer3.number1 == 3)
                    {
                        println("He didn't take anything")
                    }
                }
                else
                {
                    println("He didn't enter the store.")
                }

                println("THe buyer is walking to the checkout")

                if(buyer2.number2 == 0 && cashier2.number2 == 0 ||buyer2.number2 == 1 && cashier2.number2 == 1)
                {
                    buyer2.give(4,100)
                    cashier2.give()
                }
                else if(buyer2.number2 == 1 && cashier2.number2 ==0)
                {
                    buyer2.give(10,200)
                    println("Buyer took a Snickers from the shelf around and give to the cashier")
                    println("Buyer tried to flirt with ${cashier2.name}")
                    cashier2.give()
                }
                else if(buyer2.number2 == 0 && cashier2.number2 ==1)
                {
                    buyer2.give(50, 500)
                    println("Buyer speaks to the phone")
                    println("THE buyer is in a hurry!")
                    println("Cashier Ana tried to give him th receipt and change but he didn't take it")
                    println("Buyer is counting his money.")
                }
                else
                {
                    buyer2.give(50, 500)
                    println("Buyer speaks to the phone")
                    println("THE buyer is in a hurry!")
                    println("Cashier Ana tried to give him th receipt and change but he didn't take it")
                    println("Buyer is counting his money.")
                }

                println("Buyer is going to the Exit")
                guard2.checks()

                if(guard2.number2 == 0 || guard2.number2 == 1)
                {
                    println("The Guard stopped the buyer and checked his receipt")
                    println("All was good and the buyer left the store")
                    println("THe buyer left the store!")
                }
                else if(guard2.number2 == 2)
                {
                    println("The Guard looked at he Buyer adn stopped him")
                    println("All was good and the buyer left the store")
                    println("THe buyer left the store!")
                }
                else if(guard2.number2 == 3)
                {
                    println("The Guard looked at he Buyer adn stopped him")
                    println("HE found a snack in his pocket")
                    println("Buyer paid for it as well")
                    println("THe buyer left the store!")
                }

                println("All buyers left the store!")
                println("Today was a great day\n")
                println("There where a total of: ${buyer2.buyers1} buyers today")
                println("There where a total of: ${product1.number} products sold")
                println("THe money made today are: ${cashier2.money} $")

                println("  It's 8:00 PM the store is closing\n")


                dayCount++
                if (dayCount == 31) {
                    println("\tA month had passed")
                    println(" In this month there where a total of: ${buyer2.buyers} buyers!")
                    println(" There where a total of: ${product1.number1} products sold")
                    println(" Expenses: ${cashier2.money2} $")
                    println(" The money made this month are: ${cashier2.money1} $\n")
                    break
                }

            }

            println("Continue Simulation? :")

            when(readln().lowercase())
            {
                "y" -> continue
                "n" -> break
            }

        }
    }
    simulation()

}