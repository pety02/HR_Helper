package model

import javax.persistence.*

// TODO: to make private set for the id
// TODO: general purpose constructor
// TODO: to comment the class
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
}