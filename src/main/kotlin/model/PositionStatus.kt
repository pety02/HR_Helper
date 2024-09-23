package model

import java.time.LocalDate
import javax.persistence.*

@Table
@Entity
class PositionStatus {
    private val currentDate: LocalDate = LocalDate.now()

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long = 0
    @OneToOne
    var position: Position = Position()
    @Column
    var isOpened: Boolean = true
    @Column
    var fromDate: LocalDate = currentDate
    @Column
    var toDate: LocalDate = LocalDate.of(currentDate.year, currentDate.month, (currentDate.dayOfMonth + 7))
}