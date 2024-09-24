package model

import javax.persistence.*
import kotlin.math.max

/**
 *
 * @property maxVacationDaysPerYear
 * @property maxSickLeaveDaysPerYear
 * @author
 */
@Table
@Entity
open class Employee() : Candidate() {
    @Column
    var maxVacationDaysPerYear: Int = 0
    @Column
    var maxSickLeaveDaysPerYear: Int = 0

    /**
     *
     * @param maxVacationDaysPerYear
     * @param maxSickLeaveDaysPerYear
     */
    constructor(maxVacationDaysPerYear: Int, maxSickLeaveDaysPerYear: Int) : this() {
        this.maxVacationDaysPerYear = maxVacationDaysPerYear
        this.maxSickLeaveDaysPerYear = maxSickLeaveDaysPerYear
    }
}