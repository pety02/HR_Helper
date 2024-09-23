package model

import javax.persistence.*

@Table
@Entity
class SurveyQuestion() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
    @Column
    var question: String = ""
    @OneToMany
    var possibleAnswers: List<SurveyQuestionAnswers>? = null
    @OneToOne
    var inSurvey: Survey = Survey()
}