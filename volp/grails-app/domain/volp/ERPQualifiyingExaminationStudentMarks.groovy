package volp

class ERPQualifiyingExaminationStudentMarks {

    String seatno_rollno
    String meritno
    double total_marks
    double obtained_marks
    double percentage
    Date validitydate
    String application_id
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[learner:Learner,erpqualifiyingexaminationtype:ERPQualifiyingExaminationType]
    static constraints = {
        application_id nullable : true
    }
}
