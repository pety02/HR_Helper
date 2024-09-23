package model

import javax.persistence.*

@Table
@Entity
class SurveyResponse() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
    @Column
    var question: String = ""
    @OneToMany
    var possibleAnswers: List<SurveyQuestionAnswers>? = null
    @OneToOne
    var inSurvey: Survey = Survey()
    @OneToOne
    var answeredBy: Recruiter = Recruiter()
}