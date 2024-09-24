package model

import javax.persistence.*

/**
 *
 * @property id
 * @property question
 * @property answer
 * @property inSurvey
 * @author
 */
@Table
@Entity
class SurveyQuestionAnswer() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
        private set
    @ManyToOne
    var question: SurveyQuestion = SurveyQuestion()
    @Column
    var answer: String = ""
    @OneToOne
    var inSurvey: Survey = Survey()

    /**
     *
     * @param id
     * @param question
     * @param answer
     * @param inSurvey
     */
    constructor(id: Long, question: SurveyQuestion, answer: String, inSurvey: Survey) : this() {
        this.id = id
        this.question = question
        this.answer = answer
        this.inSurvey = inSurvey
    }
}