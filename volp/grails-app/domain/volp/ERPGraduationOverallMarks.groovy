package volp

class ERPGraduationOverallMarks {

    String course_program_name
    String name_of_institute
    String year_of_completion
    double max_marks
    double marks_obtained
    double percentage_cgpa_cpa
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[learner:Learner,erpuniversitylist:ERPUniversityList]
    static constraints = {
    }
}
