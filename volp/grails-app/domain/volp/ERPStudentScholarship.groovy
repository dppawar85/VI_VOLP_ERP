package volp

class ERPStudentScholarship {

    double scholarship_amount
    String letter_no
    Date apply_date
    Date sanction_date
    String remark
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[learner:Learner,erpscholarshipname:ERPScholarshipName,academicyear:AcademicYear,semester:Semester]
    static constraints = {
    }
}
