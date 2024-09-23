package model

import javax.persistence.*

@Table
@Entity
class File() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
    @Column
    var filename: String = ""
    @Column
    var fileType: String = ""
    @Column
    var extension: String = ""
    @OneToOne
    var addedBy: Candidate? = null
}