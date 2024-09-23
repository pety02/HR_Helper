package model

import javax.persistence.*

@Entity
@Table
class Employee() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
    @Column
    var name: String = ""
    @Column
    var surname: String = ""
    @ManyToOne
    var position: Position = Position()

    constructor(name: String, surname: String, position: Position) : this() {
        this.name = name
        this.surname = surname
        this.position = position
    }
}