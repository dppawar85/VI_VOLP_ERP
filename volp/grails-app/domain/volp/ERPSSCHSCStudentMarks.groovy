package volp

class ERPSSCHSCStudentMarks {

    String name_of_institute
    String seat_no
    String year_of_completion
    double max_marks
    double marks_obtained
    double percentage_cgpa_cpi
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[learner:Learner,erpsschscyype:ERPSSCHSCType,erpschooldivisionalboard:ERPSchoolDivisionalBoard,erphscstream:ERPHSCStream]
    static constraints = {
    }
}
