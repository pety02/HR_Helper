package model

import java.time.LocalDate
import javax.persistence.*

/**
 *
 * @property id
 * @property name
 * @property fromDate
 * @property toDate
 * @property description
 * @property questions
 * @property assignedTo
 * @property assignedBy
 * @author
 */
@Table
@Entity
class Survey() {
    private val currentDate: LocalDate = LocalDate.now()

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
        private set
    @Column
    var name: String = ""
    @Column
    var fromDate: LocalDate = currentDate
    @Column
    var toDate:LocalDate = LocalDate.of(currentDate.year, currentDate.month, (currentDate.dayOfMonth + 7))
    @Column
    var description: String? = null
    @OneToMany
    var questions: List<SurveyQuestion> = listOfNotNull()
    @OneToMany
    var assignedTo: List<Recruiter> = listOfNotNull()
    @ManyToOne
    var assignedBy: Admin = Admin()

    /**
     *
     * @param id
     * @param name
     * @param fromDate
     * @param toDate
     * @param description
     * @param questions
     * @param assignedTo
     * @param assignedBy
     */
    constructor(id: Long, name: String, fromDate: LocalDate, toDate: LocalDate, description: String?,
                questions: List<SurveyQuestion>, assignedTo: List<Recruiter>, assignedBy: Admin) : this() {

    }
}