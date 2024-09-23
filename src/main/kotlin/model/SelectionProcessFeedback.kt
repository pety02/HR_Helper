package model

import java.time.LocalDate
import javax.persistence.*

@Table
@Entity
class SelectionProcessFeedback() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
    @Column
    var date: LocalDate = LocalDate.now()
    @ManyToOne
    var fromCandidate: Candidate = Candidate()
    @ManyToOne
    var toRecruiter: Recruiter = Recruiter()
    @Column
    var feedback: String? = null
}