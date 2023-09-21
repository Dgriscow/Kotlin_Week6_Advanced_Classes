fun main() {
    //employees to test on
    val emp1 = Employee("Chris Rock", PositionTitle.ADMINISTRATION, true, 27.00,1)

    val emp2 = Employee("Dwane The Rock Johnson", PositionTitle.MAINTENANCE, false, 15.00, 2)

    val emp3 = Employee("John Cena", PositionTitle.SECRETARIAL, false, 16.00, 3)

    emp1.calculate(45.00)
    emp1.displayPay()
println()
    emp2.calculate(50.00)
    emp2.displayPay()
    println()
    emp3.calculate(35.00)
    emp3.displayPay()


}