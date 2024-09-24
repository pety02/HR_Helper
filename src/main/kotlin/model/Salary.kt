package model

import javax.persistence.*

/**
 *
 * @property id
 * @property nettAmount
 * @property grossAmount
 * @property currency
 * @property employees
 * @author
 */
@Table
@Entity
class Salary() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
        private set
    @Column
    var nettAmount: Double = 0.00
    @Column
    var grossAmount: Double = 0.00
    @Column
    var currency: String = ""
    @OneToMany
    var employees: MutableList<Employee> = mutableListOf()

    /**
     *
     * @param id
     * @param nettAmount
     * @param grossAmount
     * @param currency
     * @param employees
     */
    constructor(id: Long, nettAmount: Double, grossAmount: Double, currency: String,
                employees: MutableList<Employee>) : this() {
        this.id = id
        this.nettAmount = nettAmount
        this.grossAmount = grossAmount
        this.currency = currency
        this.employees = employees
    }
}