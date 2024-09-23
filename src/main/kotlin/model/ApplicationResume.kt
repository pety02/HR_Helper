package model

import java.time.LocalDate
import javax.persistence.*

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