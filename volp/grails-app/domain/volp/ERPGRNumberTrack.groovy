package volp

class ERPGRNumberTrack {
    int number
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[erpgrnumberinstitutecode:ERPGRNumberInstituteCode,erpgrnumberprogramcode:ERPGRNumberProgramCode,academicYear:AcademicYear]
    static constraints = {
    }
}
