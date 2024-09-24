package model

import java.time.LocalDate
import javax.persistence.*

// TODO: to make private set for the id
// TODO: general purpose constructor
// TODO: to comment the class
@Table
@Entity
class ApplicationResume() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
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
}