class SecurityGuard(var awake:Boolean, var gun:Boolean, var gipsy:Boolean,var pistol: String,_name:String):Person(_name)
{
    override var age: Int = 0

    override fun setPersonAge(_age: Int) {
        age = _age
    }
    override fun getPersonAge():Int {
        return age
    }
    var number2=(0..3).shuffled().last()

    fun checks()
    {
        if(awake == true)
        {
            println("The guard is watching the cameras")
            println("He saw the buyer and went to check his receipt")
        }
        else
        {
            println("The guard still sleeps")
        }
    }
    fun arrests()
    {
        if(awake == true && gun == true && gipsy == true)
        {
            println("The Guard arrested the gipsy using ${pistol} pistol")
        }
        else
        {
            println("The guard still sleeps")
        }

    }
    fun nameG()
    {
        println("THe guard is $name and he is $age years old")
    }
}