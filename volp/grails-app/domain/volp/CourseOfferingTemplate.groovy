package volp

class CourseOfferingTemplate {

    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[organization:Organization,courseoffering:CourseOffering,templateofering:TemplateOffering,templatedetails:TemplateDetails]
    static constraints = {
    }
}
