package model

import java.time.LocalDate
import javax.persistence.*

@Table
@Entity
class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
    @Column
    var name: String = ""
    @Column
    var fromDate:LocalDate = LocalDate.now()
    @Column
    var toDate:LocalDate? = null
    @Column
    var description: String? = null
    @Column
    var isFinished: Boolean = false
    @OneToMany
    var contractors: List<Recruiter> = listOfNotNull()
}