package lesson_2

fun main(){
    val permanentEmployees: Int = 50
    val interns: Int = 30
    val salaryPerEmployees: Int = 50000
    val salaryInterns: Int = 30000
    var sumSalaryPerEmployees: Int = permanentEmployees * salaryPerEmployees
    val sumSalaryInterns: Int = interns * salaryInterns
    val generalExpenses: Int = sumSalaryPerEmployees + sumSalaryInterns
    val averageSalary: Int = generalExpenses / (permanentEmployees + interns)

    println("""Расходы на выплату зарплаты постоянных сотрудников: $sumSalaryPerEmployees
        |Общие расходы по ЗП после прихода стажеров: $generalExpenses
        |Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary
    """.trimMargin())
}


