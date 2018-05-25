package volp

class StudentTemplate {

    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[organization:Organization,learner:Learner,templateoffering:TemplateOffering]
    static constraints = {
    }
}
