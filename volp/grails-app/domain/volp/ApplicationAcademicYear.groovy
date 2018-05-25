package volp
class ApplicationAcademicYear {

    boolean isActive   //which ay is active
    boolean isDeleted     //row is considered or deleted
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address

    static belongsTo=[applicationtype:ApplicationType,academicYear:AcademicYear,semester:Semester,organization:Organization]
    def afterUpdate()
    {
        updation_date=new java.util.Date()
    }
    static mapping = {
        creation_date defaultValue: new java.util.Date()
        isActive defaultValue:false
        isDeleted defaultValue:false
        //creation_ip_address defaultValue:request.getRemoteAddr()
    }
    static constraints = {
        semester nullable: true
    }
}
