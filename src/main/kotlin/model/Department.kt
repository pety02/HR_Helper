package model

import javax.persistence.*

/**
 *
 * @property id
 * @property name
 * @property company
 * @author
 */
@Table
@Entity
class Department() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
        private set
    @Column
    var name: String = ""
    @ManyToOne
    var company: Company = Company()

    /**
     *
     * @param id
     * @param name
     * @param company
     */
    constructor(id: Long, name: String, company: Company) : this() {
        this.id = id
        this.name = name
        this.company = company
    }
}