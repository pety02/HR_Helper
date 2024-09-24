package model

import java.time.LocalDate
import javax.persistence.*

/**
 *
 * @property
 * @property
 * @property
 * @property
 * @property
 * @property
 * @author
 */
@Table
@Entity
class ApplicationResume() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
        private set
    @Column
    var date: LocalDate = LocalDate.now()
    @OneToOne
    var fromRecruiter: Recruiter = Recruiter()
    @OneToOne
    var toCandidate: Candidate = Candidate()
    @Column
    var interviewReview: String = ""
    @Column
    var tips: String = ""

    /**
     *
     * @param id
     * @param date
     * @param fromRecruiter
     * @param toCandidate
     * @param interviewReview
     * @param tips
     */
    constructor(id: Long, date: LocalDate, fromRecruiter: Recruiter, toCandidate: Candidate,
                interviewReview: String, tips: String) : this() {
        this.id = id
        this.date = date
        this.fromRecruiter = fromRecruiter
        this.toCandidate = toCandidate
        this.interviewReview = interviewReview
        this.tips = tips
    }
}