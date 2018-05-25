package volp

class ProgramSpectificCompulsoryElective {

    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[organization:Organization,course:Course,templateoffering:TemplateOffering,templatedetails:TemplateDetails]
    static hasMany = [program:Program]
    static constraints = {
    }
}
