package model

import java.time.LocalDate
import javax.persistence.*

/**
 *
 * @property id
 * @property fromDate
 * @property toDate
 * @property note
 * @property reason
 * @author
 */
@Table
@Entity
class Vacation() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
        private set
    @Column
    var fromDate:LocalDate = LocalDate.now()
    @Column
    var toDate:LocalDate = LocalDate.now()
    @Column
    var note:String? = null
    @Column
    var reason: VacationReason = VacationReason.VACATION

    /**
     *
     * @param id
     * @param fromDate
     * @param toDate
     * @param note
     * @param reason
     */
    constructor(id: Long, fromDate: LocalDate, toDate: LocalDate, note: String?, reason: VacationReason) : this() {
        this.fromDate = fromDate
        this.toDate = toDate
        this.note = note
        this.reason = reason
    }
}