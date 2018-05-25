package volp

class Template {

    String template_code
    String template_name
    int total_credits
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[organization:Organization,templatetype:TemplateType]
    static constraints = {
    }
}
