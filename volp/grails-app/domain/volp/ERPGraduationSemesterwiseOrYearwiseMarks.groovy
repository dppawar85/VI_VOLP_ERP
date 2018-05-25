package volp

class ERPGraduationSemesterwiseOrYearwiseMarks {

    String semesteroryearname
    double maxmarks
    double marksobtained
    double percentage_cgpa_cpi
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[learner:Learner,erpgraduationexampattern:ERPGraduationExamPattern]
    static constraints = {
    }
}
