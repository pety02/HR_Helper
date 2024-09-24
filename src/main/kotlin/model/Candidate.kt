package model

import java.time.LocalDate
import javax.persistence.*

/**
 *
 * @property name
 * @property surname
 * @property telephoneNumber
 * @property position
 * @property cv
 * @property resume
 * @property referredBy
 * @property isApprovedByCV
 * @property isApprovedByHRInterview
 * @property isApprovedByInterview
 * @property candidateDate
 * @author
 */
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
    var referredBy: String? = null
    @Column
    var isApprovedByCV: Boolean = false
    @Column
    var isApprovedByHRInterview: Boolean = false
    @Column
    var isApprovedByInterview: Boolean = false
    @Column
    var candidateDate: LocalDate = LocalDate.now()

    /**
     *
     * @param name
     * @param surname
     * @param telephoneNumber
     * @param position
     * @param cv
     * @param resume
     * @param referredBy
     * @param isApprovedByCV
     * @param isApprovedByHRInterview
     * @param isApprovedByInterview
     * @param candidateDate
     */
    constructor(name: String, surname: String, telephoneNumber: String?, position: Position,
                cv: File?, resume: File?, referredBy: String?, isApprovedByCV: Boolean,
                isApprovedByHRInterview: Boolean, isApprovedByInterview: Boolean, candidateDate: LocalDate) : this() {
        this.name = name
        this.surname = surname
        this.telephoneNumber = telephoneNumber
        this.position = position
        this.cv = cv
        this.resume = resume
        this.referredBy = referredBy
        this.isApprovedByCV = isApprovedByCV
        this.isApprovedByHRInterview = isApprovedByHRInterview
        this.isApprovedByInterview = isApprovedByInterview
        this.candidateDate = candidateDate
    }
}