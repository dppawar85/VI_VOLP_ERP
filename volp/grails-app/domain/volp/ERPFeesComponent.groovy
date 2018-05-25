package volp

class ERPFeesComponent
{
    String name_of_component    //Fees/ Development Fees/ Exam Fees
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[organization:Organization,feescurrencytype:FeesCurrencyType]
    static constraints = {
    }
}
