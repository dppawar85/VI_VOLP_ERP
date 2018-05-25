package volp

class TemplateOffering {

    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[organization:Organization,template:Template,academicyear:AcademicYear,semester:Semester,module:Module,year:Year,syllabuspattern:SyllabusPattern]
    static constraints = {
    }
}
