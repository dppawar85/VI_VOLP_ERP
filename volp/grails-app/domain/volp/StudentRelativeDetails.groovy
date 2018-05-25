package volp

class StudentRelativeDetails {

    String education
    String income
    String email
    String organization
    String department
    String designation
    String office_address
    String mobile_no
    String phone_no
    static belongsTo=[person:Person,studentrelativerelationtype:StudentRelativeRelationType,occupation:ERPOccupation,erpdomacile:ERPDomacile]
    static constraints = {
    }
}
