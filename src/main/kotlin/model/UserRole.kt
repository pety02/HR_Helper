package model

import javax.persistence.*

@Table
@Entity
class UserRole() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
    @Column
    var name: String = ""
    @OneToMany
    var users: List<User>? = null
}