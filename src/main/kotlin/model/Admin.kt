package model

import javax.persistence.Entity
import javax.persistence.OneToMany
import javax.persistence.Table

/**
 *
 * @property assignedSurveys
 * @property assignedTasks
 * @author
 */
@Table
@Entity
class Admin() : Employee() {
    @OneToMany
    var assignedSurveys: List<Survey>? = null
    @OneToMany
    var assignedTasks: List<Task>? = null

    /**
     *
     * @param assignedSurveys
     * @param assignedTasks
     */
    constructor(assignedSurveys: List<Survey>?, assignedTasks: List<Task>?) : this() {
        this.assignedSurveys = assignedSurveys
        this.assignedTasks = assignedTasks
    }
}