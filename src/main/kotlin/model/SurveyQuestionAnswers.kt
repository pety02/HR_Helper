package model

import javax.persistence.*

@Table
@Entity
class SurveyQuestionAnswers() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
    @Column
    var question: String = ""
    @Column
    var answer: String = ""
    @OneToOne
    var inSurvey: Survey = Survey()
}