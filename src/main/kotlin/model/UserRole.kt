package model

import javax.persistence.*

/**
 *
 * @property id
 * @property name
 * @property users
 * @author
 */
@Table
@Entity
class UserRole() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
        private set
    @Column
    var name: String = ""
    @OneToMany
    var users: MutableList<User> = mutableListOf()

    /**
     *
     * @param id
     * @param name
     * @param users
     */
    constructor(id: Long, name: String, users: MutableList<User>) : this(){
        this.id = id
        this.name = name
        this.users = users
    }
}