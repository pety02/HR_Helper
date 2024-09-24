package model

import java.time.LocalDate
import javax.persistence.*

/**
 *
 * @property id
 * @property date
 * @property fromCandidate
 * @property toRecruiter
 * @property feedback
 * @author
 */
@Table
@Entity
class SelectionProcessFeedback() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
        private set
    @Column
    var date: LocalDate = LocalDate.now()
    @ManyToOne
    var fromCandidate: Candidate = Candidate()
    @ManyToOne
    var toRecruiter: Recruiter = Recruiter()
    @Column
    var feedback: String? = null

    /**
     *
     * @param id
     * @param date
     * @param fromCandidate
     * @param toRecruiter
     * @param feedback
     */
    constructor(id: Long, date: LocalDate, fromCandidate: Candidate, toRecruiter: Recruiter, feedback: String?) : this() {
        this.id = id
        this.date = date
        this.fromCandidate = fromCandidate
        this.toRecruiter = toRecruiter
        this.feedback = feedback
    }
}