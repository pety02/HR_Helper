package model

import java.time.LocalDate
import javax.persistence.*

@Table
@Entity
class AttendanceMonthCalendar() {
    private val currentDate: LocalDate = LocalDate.now()

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
    @Column
    var monthNo: Int = currentDate.monthValue
    @Column
    var year: Int = currentDate.year
    @OneToMany
    var vacationDays: List<Vacation>? = null
    @OneToOne
    var recruiter: Recruiter = Recruiter()
}