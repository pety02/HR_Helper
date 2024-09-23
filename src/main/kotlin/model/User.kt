package model

import javax.persistence.*

@Table
@Entity
open class User() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
    @Column
    var username: String = ""
    @Column
    var email: String = ""
    @OneToOne
    var password: Password = Password()
    @OneToMany
    var roles: List<UserRole> = listOfNotNull()
}