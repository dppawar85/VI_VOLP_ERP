package volp

class ERPICard {

    Date validupto
    String barcode
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[learner:Learner,issueay:AcademicYear,issuesemester:Semester]
    static constraints = {
    }
}
