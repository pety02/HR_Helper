package model

import javax.persistence.*

@Table
@Entity
class Company() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
    @Column
    var name: String = ""
    @Column
    var foundationYear: Int = 0
    @Column
    var description: String? = null
    @Column
    var employeesCount: Int? = null
    @OneToMany
    var departments: List<Department>? = null
    @OneToMany
    var openedPositions: List<Position>? = null
    @Column
    var fund: Double = 0.00
    @Column
    var currency: String = ""
}