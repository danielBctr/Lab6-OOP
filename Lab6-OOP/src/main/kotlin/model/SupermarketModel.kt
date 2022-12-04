package model

class SupermarketModel
{

    fun cashier(name:String):Cashier
    {
        return Cashier(name)
    }

    fun buyer(name:String):Buyer
    {
        return Buyer(name)
    }

    fun truck():Truck
    {
        return Truck()
    }

    fun securityGuard(awake:Boolean, name:String):SecurityGuard
    {
        return SecurityGuard(awake, name)
    }

    fun products():Products
    {
        return Products()
    }

}