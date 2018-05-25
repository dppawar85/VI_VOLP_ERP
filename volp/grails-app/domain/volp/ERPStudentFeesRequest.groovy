package volp

class ERPStudentFeesRequest {

    Date date_of_request
    double part_payment_amount
    String reason_for_part_payment
    Date next_applied_balance_due_date
    String letter_no
    Date letter_date
    double amount_sanctioned
    Date next_sanctioned_due_date
    String remark_from_authority
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[learner:Learner,academicyear:AcademicYear,semester:Semester,organization:Organization,erpstudentfeesrequesttype:ERPStudentFeesRequestType]
    static constraints = {
    }
}
