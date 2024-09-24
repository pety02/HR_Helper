package model

import javax.persistence.*

/**
 *
 * @property id
 * @property filename
 * @property fileType
 * @property extension
 * @property addedBy
 * @author
 */
@Table
@Entity
class File() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
        private set
    @Column
    var filename: String = ""
    @Column
    var fileType: String = ""
    @Column
    var extension: String = ""
    @OneToOne
    var addedBy: Candidate? = null

    /**
     *
     * @param id
     * @param filename
     * @param fileType
     * @param extension
     * @param addedBy
     */
    constructor(id: Long, filename: String, fileType: String, extension: String, addedBy: Candidate) : this() {
        this.id = id
        this.filename = filename
        this.fileType = fileType
        this.extension = extension
        this.addedBy = addedBy
    }
}