class Snack(
        val id: Int,
        val name: String,
        val quantity: Int,
        val cost: Double,
        val vendingMachineId: Int) {

    var setterVisibility: String = "abc"
        private set // the setter is private and has the default implementation
}