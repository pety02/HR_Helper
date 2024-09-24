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
 * @property isFinished
 * @property contractors
 * @author
 */
@Table
@Entity
class Task() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
        private set
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

    /**
     *
     * @param id
     * @param name
     * @param fromDate
     * @param toDate
     * @param description
     * @param isFinished
     * @param contractors
     */
    constructor(id: Long, name: String, fromDate: LocalDate, toDate: LocalDate?,
                description: String?, isFinished: Boolean, contractors: List<Recruiter>) : this() {
        this.id = id
        this.name = name
        this.fromDate = fromDate
        this.toDate = toDate
        this.description = description
        this.isFinished = isFinished
        this.contractors = contractors
    }
}