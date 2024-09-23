package model

import javax.persistence.*

@Table
@Entity
class Password() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
    @Column
    var hashedPassword: String = ""
    @OneToOne
    var user: User = User()
}