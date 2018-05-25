package volp

class SoftwareModuleOffering {

    boolean isCurrent
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[softwaremodule:SoftwareModule,academicyear:AcademicYear,semester:Semester,organization:Organization]
    static constraints = {
    }
}
