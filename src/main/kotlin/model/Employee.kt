package model

import java.time.LocalDate
import javax.persistence.*

/**
 *
 * @property maxVacationDaysPerYear
 * @property maxSickLeaveDaysPerYear
 * @property isFired
 * @property hireDate
 * @property fireDate
 * @author
 */
@Table
@Entity
open class Employee() : Candidate() {
    @Column
    var maxVacationDaysPerYear: Int = 0
    @Column
    var maxSickLeaveDaysPerYear: Int = 0
    @Column
    var isFired: Boolean = false
    @Column
    var hireDate: LocalDate = LocalDate.now()
    @Column
    var fireDate: LocalDate? = null

    /**
     *
     * @param maxVacationDaysPerYear
     * @param maxSickLeaveDaysPerYear
     * @param isFired
     * @param hireDate
     * @param fireDate
     */
    constructor(maxVacationDaysPerYear: Int, maxSickLeaveDaysPerYear: Int, isFired: Boolean,
        hireDate: LocalDate, fireDate: LocalDate?) : this() {
        this.maxVacationDaysPerYear = maxVacationDaysPerYear
        this.maxSickLeaveDaysPerYear = maxSickLeaveDaysPerYear
        this.isFired = isFired
        this.hireDate = hireDate
        this.fireDate = fireDate
    }
}