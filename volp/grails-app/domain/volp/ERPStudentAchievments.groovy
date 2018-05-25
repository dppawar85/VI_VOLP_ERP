package volp

class ERPStudentAchievments {

    String name_of_award
    String awarding_institute
    String level
    String basis_of_award
    String year
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[learner:Learner,erpawardtype:ERPAwardType]
    static constraints = {
    }
}
