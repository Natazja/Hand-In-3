class Bicycle {
    var gear: Int = 0
    var speed: Int = 0

    fun changeGear(a:Int) {
        gear = a
        println("Gear is changed to ${gear}")
    }

    fun speedUp(a: Int) {
        speed += a
        println("Speed is changed to ${speed}")
    }

    fun applyBreaks(a: Int) {
        speed -= a
        println("brakes applied. Speed reduced to ${speed} km/t")
    }
}