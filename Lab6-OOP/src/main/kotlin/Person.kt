abstract class Person(_name: String)
{
    var name: String
    abstract var age: Int

    init {
        this.name = _name
    }

    abstract fun setPersonAge(_age:Int)
    abstract fun getPersonAge():Int

    fun getPersonName(){
        println("Name = $name")
    }
}