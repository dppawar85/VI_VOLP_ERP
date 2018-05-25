package volp

class TemplateOfferingProgram {

    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[organization:Organization,program:Program,templateoffering:TemplateOffering]
    static hasMany = [programgroup:ProgramGroup]
    static constraints = {
    }
}
