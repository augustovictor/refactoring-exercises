package refactoringexercises.smells.bloaters.longMethod

class MonthDate(val month: Int, val day: Int)

class Calculator {
    fun calculateTotalAmount(initialValue: Double, discount: Double = 0.0, monthDate: MonthDate): Double {
        return getTotalValue(
                initialValue,
                getTotalDiscount(discount, monthDate.day),
                getVendorComission(monthDate)
        )
    }

    private fun getVendorComission(monthDate: MonthDate): Double {
        val result : Double

        if (isFirstMonthOrFirstDay(monthDate)) {
            result = 0.05
        } else if (isSecondMonth(monthDate)) {
            result = 0.02
        } else {
            result = 0.01
        }

        return result
    }

    private fun isSecondMonth(monthDate: MonthDate) = monthDate.month == 2
    private fun isFirstMonthOrFirstDay(monthDate: MonthDate): Boolean = monthDate.month == 1 || monthDate.day == 1
    private fun getAdditionalDiscount(currentDay: Int): Double {
        var result = 0.0

        if (isInLastDaysOfMonth(currentDay)) {
            result = 0.10
        } else if (isLastDayOfMonth(currentDay)) {
            result = 0.20
        }

        return result
    }
    private fun isLastDayOfMonth(currentDay: Int) = currentDay == 30
    private fun isInLastDaysOfMonth(currentDay: Int) = currentDay in 25..29
    private fun getTotalDiscount(discount: Double, currentDay: Int): Double {
        return discount + getAdditionalDiscount(currentDay)
    }
    private fun getTotalValue(initialValue: Double, totalDiscount: Double, vendorComission: Double): Double {
        return initialValue - (totalDiscount * initialValue) + (vendorComission * initialValue)
    }
}