package controller

import model.SupermarketModel
import view.SupermarketView

class SupermarketController
{
    fun simulation()
    {
        while(true)
        {
            var dayCount = 1
            val coming = SupermarketView()
            val count = SupermarketView()

            while(dayCount <= 30)
            {
                count.count()
                val truck1 = SupermarketModel().truck()
                val cashier2 = SupermarketModel().cashier("Ana")
                val buyer2 = SupermarketModel().buyer("Alex")
                val buyer3 = SupermarketModel().buyer("Daniela")
                val guard2 = SupermarketModel().securityGuard(true,"James")
                val print = SupermarketView()
                val arrive = SupermarketView()
                val coffee = SupermarketView()
                val people = SupermarketView()
                val choose = SupermarketView()
                val payment = SupermarketView()
                val see = SupermarketView()
                val end = SupermarketView()


                print.time("m")
                if(cashier2.number1 == 1 || cashier2.number1 == 0)
                {
                    arrive.arrive("n")

                }
                else if (cashier2.number1 == 2)
                {
                    arrive.arrive("y")
                }


                if(truck1.products1 in 250..500)
                {
                    truck1.arrive()
                    coffee.stay("n")
                    if(truck1.number == 1)
                    {
                        truck1.left()
                    }
                    else if(truck1.number == 0)
                    {
                        coffee.stay("y")
                        truck1.left()
                    }
                }

                print.time("o")

                when (buyer2.number) {
                    1, 0 -> {
                        people.enter("q")
                    }
                    2 -> {
                        people.enter("w")
                    }
                    3 -> {
                        people.enter("e")
                    }
                }

                when (buyer3.number) {
                    1, 0 -> {
                        buyer3.choose()
                        choose.choose("a")
                        when (buyer3.number1) {
                            0 -> {
                                choose.choose("1")
                            }

                            1 -> {
                                choose.choose("2")
                            }

                            2 -> {
                                choose.choose("3")
                            }

                            3 -> {
                                choose.choose("4")
                            }
                        }
                    }
                    2, 3 -> {
                        buyer3.choose()
                        choose.choose("b")
                        when (buyer3.number1) {
                            0 -> {
                                choose.choose("5")
                            }

                            1 -> {
                                choose.choose("6")
                            }

                            2 -> {
                                choose.choose("7")
                            }

                            3 -> {
                                choose.choose("8")
                            }
                        }
                    }
                    else -> {
                        choose.choose("c")
                    }
                }

                payment.pay("q")

                if(buyer2.number2 == 0 && cashier2.number2 == 0 ||buyer2.number2 == 1 && cashier2.number2 == 1)
                {
                    buyer2.give(4,100)
                    cashier2.give()
                }
                else if(buyer2.number2 == 1 && cashier2.number2 ==0)
                {
                    buyer2.give(10,200)
                    payment.pay("w")
                    cashier2.give()
                }
                else if(buyer2.number2 == 0 && cashier2.number2 ==1)
                {
                    buyer2.give(50, 500)
                    payment.pay("e")
                }
                else
                {
                    buyer2.give(50, 500)
                    payment.pay("r")
                }

                payment.pay("t")
                guard2.checks()

                when (guard2.number2) {
                    0, 1 -> {
                        see.check("a")
                    }
                    2 -> {
                        see.check("s")
                    }
                    3 -> {
                        see.check("d")
                    }
                }

                see.check("f")

                print.time("n")

                dayCount++
                if (dayCount == 31)
                {
                    end.end()
                    break
                }
            }

            coming.next()

            when(readln().lowercase())
            {
                "y" -> continue
                "n" -> break
            }

        }
    }
}