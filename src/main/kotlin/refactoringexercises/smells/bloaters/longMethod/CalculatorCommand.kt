package refactoringexercises.smells.bloaters.longMethod

class CalculatorCommand(
        val initialValue: Double,
        val discount: Double = 0.0,
        val currentMonth: Int,
        val currentDay: Int
) {
    fun execute(): Double {
        val totalValue: Double
        var additionalDiscount = 0.0
        var totalDiscount = 0.0
        val vendorComission : Double
        if (currentMonth == 1 || currentDay == 1) {
            vendorComission = 0.05
        } else if (currentMonth == 2) {
            vendorComission = 0.02
        } else {
            vendorComission = 0.01
        }
        if (currentDay in 25..29) {
            additionalDiscount = 0.10
        } else if (currentDay == 30) {
            additionalDiscount = 0.20
        }

        totalDiscount += discount + additionalDiscount
        totalValue = initialValue - (totalDiscount * initialValue) + (vendorComission * initialValue)
        return totalValue
    }
}