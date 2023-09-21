class Employee (var name:String,
    var positionTitle: PositionTitle,
    var salary:Boolean,
    var payRate:Double,
    var shift:Int){

    var endOfWeekPay:Double = 0.0



    fun calculate(hoursIn:Double){



        when(shift){

            2 -> {
                val payIncrease = payRate * 0.05
                payRate += payIncrease
            }

            3 -> {
                val payincrease = payRate * 0.1
                payRate += payincrease
            }

        }

        endOfWeekPay = hoursIn * payRate


    }


    fun displayPay(){
        println("$name\n${positionTitle.titleStr} Is Salary: $salary\nShift $shift\nCurrent Pay Rate is: $$payRate\n$name Earned $$endOfWeekPay this Week")
    }

}