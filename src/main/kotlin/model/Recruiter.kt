package model

import javax.persistence.*

/**
 *
 * @property attendanceCalendar
 * @property assignedSurveys
 * @property assignedTasks
 * @author
 */
@Table
@Entity
class Recruiter() : Employee() {
    @OneToMany
    var attendanceCalendar: List<AttendanceMonthCalendar>? = null
    @OneToMany
    var assignedSurveys: List<Survey>? = null
    @OneToMany
    var assignedTasks: List<Task>? = null

    /**
     * @param attendanceCalendar
     * @param assignedSurveys
     * @param assignedTasks
     */
    constructor(attendanceCalendar: List<AttendanceMonthCalendar>?, assignedSurveys: List<Survey>?,
                assignedTasks: List<Task>?) : this() {
        this.attendanceCalendar = attendanceCalendar
        this.assignedSurveys = assignedSurveys
        this.assignedTasks = assignedTasks
    }
}