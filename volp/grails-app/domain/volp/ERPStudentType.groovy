package volp

class ERPStudentType {

    String type  //Regular(Normal)/Year Down/Admission_cancelled/Detained
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[organization:Organization]
    static constraints = {
    }
}
