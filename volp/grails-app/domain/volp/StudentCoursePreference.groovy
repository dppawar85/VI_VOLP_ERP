package volp

class StudentCoursePreference {

    int preference
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[organization:Organization,learner:Learner,courseoffering:CourseOffering]
    static constraints = {
    }
}
