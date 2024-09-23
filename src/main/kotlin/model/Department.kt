package model

import javax.persistence.*

@Table
@Entity
class Department() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
    @Column
    var name: String = ""
    @OneToOne
    var company: Company = Company()
}