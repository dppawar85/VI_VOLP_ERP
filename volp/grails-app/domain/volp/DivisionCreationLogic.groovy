package volp

class DivisionCreationLogic {

    String logicdetails
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[divisionoffering:DivisionOffering,organization:Organization]
    static constraints = {
    }
}
