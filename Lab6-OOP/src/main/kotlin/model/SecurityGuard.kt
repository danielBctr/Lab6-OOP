package model

class SecurityGuard(private var awake:Boolean,name:String): Person(name)
{
    override var age: Int = 0

    override fun setPersonAge(age: Int) {
        this.age = age
    }
    override fun getPersonAge():Int {
        return age
    }
    var number2=(0..3).shuffled().last()

    fun checks()
    {
        if(awake)
        {
            println("The guard is watching the cameras")
            println("He saw the buyer and went to check his receipt")
        }
        else
        {
            println("The guard still sleeps")
        }
    }
}