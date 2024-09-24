package model

import javax.persistence.*

@Entity
@Table
open class Candidate() : User(){
    @Column
    var name: String = ""
    @Column
    var surname: String = ""
    @Column
    var telephoneNumber: String? = null
    @ManyToOne
    var position: Position = Position()
    @OneToOne
    var cv: File? = null
    @OneToOne
    var resume: File? = null
    @Column
    var referredBy: String? = null;
    @Column
    var isApprovedByCV: Boolean = false;
    @Column
    var isApprovedByHRInterview: Boolean = false;
    @Column
    var isApprovedByInterview: Boolean = false;

    constructor(name: String, surname: String, position: Position) : this() {
        this.name = name
        this.surname = surname
        this.position = position
    }
}