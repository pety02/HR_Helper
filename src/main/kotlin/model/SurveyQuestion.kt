package model

import javax.persistence.*

/**
 *
 * @property id
 * @property question
 * @property possibleAnswers
 * @property assignedIn
 * @author
 */
@Table
@Entity
class SurveyQuestion() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
        private set
    @Column
    var question: String = ""
    @OneToMany
    var possibleAnswers: List<SurveyQuestionAnswer>? = null
    @OneToOne
    var assignedIn: Survey = Survey()

    /**
     *
     * @param id
     * @param question
     * @param possibleAnswers
     * @param assignedIn
     */
    constructor(id: Long, question: String, possibleAnswers: List<SurveyQuestionAnswer>, assignedIn: Survey) : this() {
        this.id = id
        this.question = question
        this.possibleAnswers = possibleAnswers
        this.assignedIn = assignedIn
    }
}