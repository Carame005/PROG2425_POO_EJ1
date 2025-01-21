class Rectangulo(val base : Double, val altura : Double){
    private var a : Double = 0.0
    private var p : Double = 0.0

    init {
        require(base > 0){"La base debe ser mayor que 0"}
        require(altura > 0){"La altura debe ser mayor que 0"}
    }

    fun area(): Double{
        val a : Double = base * altura
        return a
    }

    fun perimetro(): Double {
        val p : Double= 2*base + 2*altura
        return p
    }

    override fun toString(): String {
        return "El rectangulo de base $base y altura $altura tiene un area de $a y perimetro de $p"
    }
}

fun main(){

    val rectangulo1 = Rectangulo(8.0,9.0)
    rectangulo1.area()
    rectangulo1.perimetro()
    println(rectangulo1)

    try {
        val rectangulo2 = Rectangulo(-8.0,9.0)
        rectangulo2.area()
        rectangulo2.perimetro()
        println(rectangulo2)
    }catch (e: IllegalArgumentException){"ERROR: ${e.message}"}

    try {
        val rectangulo3 = Rectangulo(8.0,-9.0)
        rectangulo3.area()
        rectangulo3.perimetro()
        println(rectangulo3)
    }catch (e: IllegalArgumentException){"ERROR: ${e.message}"}
}