package refactoringexercises.smells.bloaters.longMethod

class Calculator {
    fun calculateTotalAmount(initialValue: Double, discount: Double = 0.0, currentMonth: Int, currentDay: Int): Double {
        return CalculatorCommand(initialValue, discount, currentMonth, currentDay).execute()
    }
}