package model

import javax.persistence.*

@Table
@Entity
class Recruiter() : Employee() {
    @OneToMany
    val attendanceCalendar: List<AttendanceMonthCalendar>? = null
    @OneToMany
    val includedAtSurveys: List<Survey>? = null
    @OneToMany
    val assignedTasks: List<Task>? = null
}