package model

import javax.persistence.*

@Table
@Entity
class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
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
    var candidates: List<Candidate?> = listOf()
}