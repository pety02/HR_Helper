package model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Position {
    @Id
    private var id: Long = 1
    private var name: String = ""
    private var salary: Double = 0.00

}