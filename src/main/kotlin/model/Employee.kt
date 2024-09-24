package model

import javax.persistence.*

@Table
@Entity
open class Employee() : Candidate() {
    @Column
    var maxVacationDaysPerYear: Int = 0
    @Column
    var maxSickLeaveDaysPerYear: Int = 0
}