package model

import javax.persistence.*

@Table
@Entity
class Salary() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
    @Column
    var nettSalary: Double = 0.00
    @Column
    var grossSalary: Double = 0.00
    @Column
    var currency: String = ""
    @Column
    var calculatedSalary = 0.00
    @OneToMany
    var employees: List<Employee> = listOfNotNull()
}