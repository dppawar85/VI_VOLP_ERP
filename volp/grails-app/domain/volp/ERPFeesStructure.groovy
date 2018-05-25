package volp

class ERPFeesStructure {

    double component_amount
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[erpfeesstructuremaster:ERPFeesStructureMaster,erpfeescomponent:ERPFeesComponent]
    static constraints = {
    }
}
