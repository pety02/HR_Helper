package model

import javax.persistence.*

/**
 *
 * @property id
 * @property hashedPassword
 * @property user
 * @author
 */
@Table
@Entity
class Password() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
        private set
    @Column
    var hashedPassword: String = ""
    @OneToOne
    var user: User = User()

    /**
     *
     * @param id
     * @param hashedPassword
     * @param user
     */
    constructor(id: Long, hashedPassword: String, user: User) : this() {
        this.id = id
        this.hashedPassword = hashedPassword
        this.user = user
    }
}