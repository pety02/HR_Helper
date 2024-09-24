package model

import java.time.LocalDate
import javax.persistence.*

/**
 *
 * @property id
 * @property monthNo
 * @property year
 * @property vacationDays
 * @property recruiter
 * @author
 */
@Table
@Entity
class AttendanceMonthCalendar() {
    private val currentDate: LocalDate = LocalDate.now()

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
        private set
    @Column
    var monthNo: Int = currentDate.monthValue
    @Column
    var year: Int = currentDate.year
    @OneToMany
    var vacationDays: List<Vacation>? = null
    @OneToOne
    var recruiter: Recruiter = Recruiter()

    /**
     *
     * @param id
     * @param monthNo
     * @param year
     * @param vacationDays
     * @param recruiter
     */
    constructor(id: Long, monthNo: Int, year: Int, vacationDays: List<Vacation>?, recruiter: Recruiter) : this() {
        this.id = id
        this.monthNo = monthNo
        this.year = year
        this.vacationDays = vacationDays
        this.recruiter = recruiter
    }
}