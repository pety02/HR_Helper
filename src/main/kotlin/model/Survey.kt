package model

import org.hibernate.annotations.CollectionId
import java.time.LocalDate
import javax.persistence.*

@Table
@Entity
class Survey() {
    private val currentDate: LocalDate = LocalDate.now()

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
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
    var assignedToRecruiters: List<Recruiter> = listOfNotNull()
}