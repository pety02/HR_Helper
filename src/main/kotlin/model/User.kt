package model

import javax.persistence.*

/**
 *
 * @property id
 * @property username
 * @property email
 * @property password
 * @property roles
 * @author
 */
@Table
@Entity
open class User() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
        private set
    @Column
    var username: String = ""
    @Column
    var email: String = ""
    @OneToOne
    var password: Password = Password()
    @OneToMany
    var roles: List<UserRole> = listOfNotNull()

    /**
     *
     * @param id
     * @param username
     * @param email
     * @param password
     * @param roles
     */
    constructor(id: Long, username: String, email: String, password: Password, roles: List<UserRole>) : this() {
        this.id = id
        this.username = username
        this.email = email
        this.password = password
        this.roles = roles
    }
}