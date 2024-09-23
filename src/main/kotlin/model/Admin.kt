package model

import javax.persistence.Entity
import javax.persistence.OneToMany
import javax.persistence.Table

@Table
@Entity
class Admin() : Employee() {
    @OneToMany
    var assignedSurveys: List<Survey>? = null
    @OneToMany
    var assignedTasks: List<Task>? = null
}