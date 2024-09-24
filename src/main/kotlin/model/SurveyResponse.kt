package model

import javax.persistence.*

/**
 *
 * @property id
 * @property question
 * @property currentAnswers
 * @property answeredBy
 * @author
 */
@Table
@Entity
class SurveyResponse() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
        private set
    @ManyToOne
    var question: SurveyQuestion = SurveyQuestion()
    @OneToMany
    var currentAnswers: List<SurveyQuestionAnswer>? = null
    @OneToOne
    var answeredBy: Recruiter = Recruiter()

    /**
     *
     * @param id
     * @param question
     * @param currentAnswers
     * @param answeredBy
     * @author
     */
    constructor(id: Long, question: SurveyQuestion, currentAnswers: List<SurveyQuestionAnswer>?, answeredBy: Recruiter) : this() {
        this.id = id
        this.question = question
        this.currentAnswers = currentAnswers
        this.answeredBy = answeredBy
    }
}