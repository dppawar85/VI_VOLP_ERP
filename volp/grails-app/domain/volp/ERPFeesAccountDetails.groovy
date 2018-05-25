package volp

class ERPFeesAccountDetails {

    String details
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[erpfeesaccounttype:ERPFeesAccountType]
    static constraints = {
    }
}
