package view

import model.SupermarketModel

class SupermarketView
{
    private val cashier2 = SupermarketModel().cashier("Ana")
    private val cashier3 = SupermarketModel().cashier("Tania")
    private val buyer2 = SupermarketModel().buyer("Alex")
    private val product1 = SupermarketModel().products()
    private var dayCount = 1

    fun time(hour: String)
    {
        when (hour)
        {
            "m" -> {
                println("  It's 7:00 AM")
            }
            "n" -> {
                println("  It's 8:00 PM the store is closing\n")
            }
            "o" -> {
                println("  It's 8:00 AM the Supermarket has opened")
            }
        }
    }

    fun arrive(late:String)
    {
        if(late == "n")
        {
            println("Cashier ${cashier2.name} came to work and Entered the building through the Main door")
            println("${cashier3.name} the cashier came to work too")
        }
        else if(late == "y")
        {
            println("Cashier ${cashier2.name} it's 5 minutes late and she entered trough back door.")
            println("${cashier3.name} met ${cashier2.name} and they both entered the store.")
        }
    }

    fun stay(stay:String)
    {
        if(stay == "n")
        {
            println("The Products are put into the Store by ${cashier2.name} ${cashier3.name}")
        }
        else if(stay == "y")
        {
            println("The Driver stayed for 10 more minutes to drink a coffee with ${cashier2.name} and ${cashier3.name} ")
        }
    }

    fun enter(people:String)
    {
        when (people)
        {
            "q" -> {
                println("The Buyer entered the store")
                println("Buyer Put his stuff in the closet and took a Shopping cart from the 50 that there are")
                println("Client is walking trough the store")
                println("Another model.Buyer entered the store...")

            }
            "w" -> {
                println("First Client entered the store")
                println("He just said 'Hello' to the workers and took a Shopping cart")
                println("Another client entered the store")
                println("A family entered the store")

            }
            "e" -> {
                println("Some kids entered the store")
                println("They went straight to the Ice-Cream")
                println("A grandma entered the store")
                println("A family entered the store")
            }
        }
    }

    fun choose(some:String)
    {
        when (some)
        {
            "a" -> {
                println("Client is looking at all products")
                println("he took some snacks, coke")
                println("buyer is walking to the meat section")

            }
            "1" -> {
                println("He took some chicken breast")
            }
            "2" -> {
                println("He took some beef")
            }
            "3" -> {
                println("He took some pork")
            }
            "4" -> {
                println("He didn't take anything")
            }
            "b" -> {
                println("Client is looking at all products")
                println("he took some fruits")
                println("buyer is walking to the vegetables section")
            }
            "5" -> {
                println("He took some carrots, onions")
            }
            "6" -> {
                println("He took some potatoes, tomatoes")
            }
            "7" -> {
                println("He took some broccoli, cabbage")
            }
            "8" -> {
                println("He didn't take anything")
            }
            "c" -> {
                println("He didn't enter the store.")
            }
        }

    }

    fun pay(go:String)
    {
        when (go)
        {
            "q" -> {
                println("THe buyer is walking to the checkout")

            }
            "w" -> {
                println("model.Buyer took a Snickers from the shelf around and give to the cashier")
                println("model.Buyer tried to flirt with ${cashier2.name}")
            }
            "e" -> {
                println("model.Buyer speaks to the phone")
                println("THE buyer is in a hurry!")
                println("model.Cashier Ana tried to give him th receipt and change but he didn't take it")
                println("model.Buyer is counting his money.")
            }
            "r" -> {
                println("model.Buyer speaks to the phone")
                println("THE buyer is in a hurry!")
                println("model.Cashier Ana tried to give him th receipt and change but he didn't take it")
                println("model.Buyer is counting his money.")
            }
            "t" -> {
                println("model.Buyer is going to the Exit")
            }
        }

    }

    fun check(eye:String)
    {
        when (eye)
        {
            "a" -> {
                println("The Guard stopped the buyer and checked his receipt")
                println("All was good and the buyer left the store")
                println("THe buyer left the store!")
            }
            "s" -> {
                println("The Guard looked at he model.Buyer adn stopped him")
                println("All was good and the buyer left the store")
                println("THe buyer left the store!")
            }
            "d" -> {
                println("The Guard looked at he model.Buyer adn stopped him")
                println("HE found a snack in his pocket")
                println("model.Buyer paid for it as well")
                println("THe buyer left the store!")
            }
            "f" -> {
                println("All buyers left the store!")
                println("Today was a great day\n")
                println("There where a total of: ${buyer2.buyers1} buyers today")
                println("There where a total of: ${product1.number} products sold")
                println("THe money made today are: ${cashier2.money} $")
            }
        }
    }

    fun end()
    {
        println("\tA month had passed")
        println(" In this month there where a total of: ${buyer2.buyers} buyers!")
        println(" There where a total of: ${product1.number1} products sold")
        println(" Expenses: ${cashier2.money2} $")
        println(" The money made this month are: ${cashier2.money1} $\n")
    }

    fun next()
    {
        println("Continue Simulation? :")
    }

    fun count()
    {
        println("\tDay Number: $dayCount")
        dayCount++
    }

}