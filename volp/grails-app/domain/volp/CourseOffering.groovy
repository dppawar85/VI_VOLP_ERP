package volp

class CourseOffering {

    Date start_date
    Date end_date
    int threshold
    boolean isActive    //Active / Archieved
    boolean isDeleted
    boolean isDeleteRequestDone
    String batch
    int sort_order
    int min_student
    int max_student
    int balance_student
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[course:Course,year:Year,academicyear:AcademicYear,semester:Semester,coursetype:CourseType,courseofferingtype:CourseOfferingType,module:Module,templateoffering:TemplateOffering,templatedetails:TemplateDetails,organization:Organization]
    static constraints = {
        year nullable:true
        academicyear nullable:true
        semester nullable:true
        coursetype nullable:true
        start_date nullable:true
        end_date n11ullable:true
        module nullable:true
        organization nullable:true
        templateoffering nullable:true
        templatedetails nullable:true
    }
    static mapping = {
        sort_order defaultValue:0
        min_student defaultValue:0
        max_student defaultValue:0
        balance_student defaultValue:0

    }
}
