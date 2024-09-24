package model

import javax.persistence.Entity
import javax.persistence.OneToMany
import javax.persistence.Table

// TODO: to make private set for the id
// TODO: general purpose constructor
// TODO: to comment the class
@Table
@Entity
class Admin() : Employee() {
    @OneToMany
    var assignedSurveys: List<Survey>? = null
    @OneToMany
    var assignedTasks: List<Task>? = null
}