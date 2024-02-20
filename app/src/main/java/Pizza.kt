class Pizza (
    override val name: String,
    override var price: Double,
    override var calories: Int
) : FastFood {
    override fun printFastFoodDetails() {
        println("${name}, costs ${price}, depending on the size, and has ${calories} calories.")
    }
}