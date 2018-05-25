package volp

class ERPFeesDepositeType {

    String type  //Admission Fees / Eligibility Fees / Hostel Fees / FF Fees / Late Fine / Old Dues
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[organization:Organization]
    static constraints = {
    }
}
