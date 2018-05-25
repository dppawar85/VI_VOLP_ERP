package volp

class ERPStudentWorkExperience {

    String organization_name
    String organization_address
    String designation
    String brief_discription_about_nature_of_work
    String designation_of_last_person_reporting_to
    int experience_in_years
    int experience_in_months
    Date from_date
    Date to_date
    boolean isCurrentJob
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[learner:Learner,ertypeofexperience:ERPTypeofExperience]
    static constraints = {
    }
}
