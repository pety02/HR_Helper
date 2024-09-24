package model

import javax.persistence.*

/**
 *
 * @property id
 * @property name
 * @property department
 * @property salary
 * @property description
 * @property status
 * @property candidates
 * @author
 */
@Table
@Entity
class Position() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
        private set
    @Column
    var name: String = ""
    @OneToOne
    var department: Department = Department()
    @OneToOne
    var salary: Salary = Salary()
    @Column
    var description: String? = null
    @OneToOne
    var status: PositionStatus = PositionStatus()
    @OneToMany
    var candidates: MutableList<Candidate>? = mutableListOf()

    /**
     *
     * @param id
     * @param name
     * @param department
     * @param salary
     * @param description
     * @param status
     * @param candidates
     */
    constructor(id: Long, name: String, department: Department, salary: Salary, description: String?,
                status: PositionStatus, candidates: MutableList<Candidate>) : this() {
        this.id = id
        this.name = name
        this.department = department
        this.salary = salary
        this.description = description
        this.status = status
        this.candidates = candidates
    }
}