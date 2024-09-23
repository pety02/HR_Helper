package model

import java.time.LocalDate
import javax.persistence.*

@Table
@Entity
class Vacation() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
    @Column
    var fromDate:LocalDate = LocalDate.now()
    @Column
    var toDate:LocalDate = LocalDate.now()
    @Column
    var note:String? = null
    @Column
    var reason: VacationReason = VacationReason.VACATION
}