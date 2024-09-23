package model

import javax.persistence.*

@Table
@Entity
open class Employee() : User() {
    @Column
    var name: String = ""
    @Column
    var surname: String = ""
    @Column
    var telephoneNumber: String? = null
    @OneToOne
    var position: Position = Position()
    @Column
    var maxVacationDaysPerYear: Int = 0
    @Column
    var maxSickLeaveDaysPerYear: Int = 0
}