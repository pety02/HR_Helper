package model

import javax.persistence.*

/**
 *
 * @property id
 * @property name
 * @property foundationYear
 * @property description
 * @property employeesCount
 * @property departments
 * @property openedPositions
 * @property fund
 * @property currency
 * @author
 */
@Table
@Entity
class Company() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
        private set
    @Column
    var name: String = ""
    @Column
    var foundationYear: Int = 0
    @Column
    var description: String? = null
    @Column
    var employeesCount: Int = 0
    @OneToMany
    var departments: List<Department>? = null
    @OneToMany
    var openedPositions: List<Position>? = null
    @Column
    var fund: Double = 0.00
    @Column
    var currency: String = ""

    /**
     *
     * @param id
     * @param name
     * @param foundationYear
     * @param description
     * @param employeesCount
     * @param departments
     * @param openedPositions
     * @param fund
     * @param currency
     */
    constructor(id: Long, name: String, foundationYear: Int, description: String?,
        employeesCount: Int, departments: List<Department>, openedPositions: List<Position>?,
        fund: Double, currency: String) : this() {
        this.id = id
        this.name = name
        this.foundationYear = foundationYear
        this.description = description
        this.employeesCount = employeesCount
        this.departments = departments
        this.openedPositions = openedPositions
        this.fund = fund
        this.currency = currency
    }
}