package refactoringexercises.smells.bloaters.longMethod

class Calculator {
    fun calculateTotalAmount(initialValue: Double, discount: Double = 0.0, currentMonth: Int, currentDay: Int): Double {
        return getTotalValue(
                initialValue,
                getTotalDiscount(discount, currentDay),
                getVendorComission(currentMonth, currentDay)
        )
    }

    private fun getVendorComission(currentMonth: Int, currentDay: Int): Double {
        val result : Double

        if (currentMonth == 1 || currentDay == 1) {
            result = 0.05
        } else if (currentMonth == 2) {
            result = 0.02
        } else {
            result = 0.01
        }

        return result
    }
    private fun getAdditionalDiscount(currentDay: Int): Double {
        var result = 0.0

        if (currentDay in 25..29) {
            result = 0.10
        } else if (currentDay == 30) {
            result = 0.20
        }

        return result
    }
    private fun getTotalDiscount(discount: Double, currentDay: Int): Double {
        return discount + getAdditionalDiscount(currentDay)
    }
    private fun getTotalValue(initialValue: Double, totalDiscount: Double, vendorComission: Double): Double {
        return initialValue - (totalDiscount * initialValue) + (vendorComission * initialValue)
    }
}