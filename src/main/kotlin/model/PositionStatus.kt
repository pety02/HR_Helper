package model

import java.time.LocalDate
import javax.persistence.*

/**
 *
 * @property id
 * @property position
 * @property isOpened
 * @property fromDate
 * @property toDate
 * @author
 */
@Table
@Entity
class PositionStatus() {
    private val currentDate: LocalDate = LocalDate.now()

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
        private set
    @OneToOne
    var position: Position = Position()
    @Column
    var isOpened: Boolean = true
    @Column
    var fromDate: LocalDate = currentDate
    @Column
    var toDate: LocalDate = LocalDate.of(currentDate.year, currentDate.month, (currentDate.dayOfMonth + 7))

    /**
     *
     * @param id
     * @param position
     * @param isOpened
     * @param fromDate
     * @param toDate
     */
    constructor(id: Long, position: Position, isOpened: Boolean, fromDate: LocalDate, toDate: LocalDate) : this() {
        this.id = id
        this.position = position
        this.isOpened = isOpened
        this.fromDate = fromDate
        this.toDate = toDate
    }
}