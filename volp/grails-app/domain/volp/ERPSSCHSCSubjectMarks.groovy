package volp

class ERPSSCHSCSubjectMarks {

    String subject_name
    double max_marks
    double marks_obtained
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[erpsschscstudentmarks:ERPSSCHSCStudentMarks]
    static constraints = {
    }
}
