package volp

class ERPStudentActivity {
    String role
    String level
    Date from_date
    Date to_date
    String honours
    String remarks
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[learner:Learner,erpstudentactivitytype:ERPStudentActivityType]
    static constraints = {
    }
}
