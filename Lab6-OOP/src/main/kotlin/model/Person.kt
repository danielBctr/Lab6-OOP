package model

abstract class Person(name: String)
{
    var name: String
    abstract var age: Int

    init
    {
        this.name = name
    }

    abstract fun setPersonAge(age:Int)
    abstract fun getPersonAge():Int

}