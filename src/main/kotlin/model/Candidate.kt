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
    @OneToOne
    var cv: File? = null
    @OneToOne
    var resume: File? = null
    @Column
    var referedBy: String? = null;
    @ManyToOne
    var position: Position = Position()

    constructor(name: String, surname: String, position: Position) : this() {
        this.name = name
        this.surname = surname
        this.position = position
    }
}