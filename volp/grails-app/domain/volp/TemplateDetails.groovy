package volp

class TemplateDetails {

    int credit_per_course
    String subject_head
    int bucket_number
    boolean isProgramSpectificCompulsoryElective   //Yes/No
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[organization:Organization,template:Template,erpcoursecategory:ERPCourseCategory,courserule:CourseRule,coursetype:CourseType]
    static constraints = {
    }
}
