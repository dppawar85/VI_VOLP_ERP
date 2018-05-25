package volp

class DivisionOffering {

    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[division:Division,year:Year,program:Program,shift:ERPShift,organization:Organization]
    static constraints = {
    }
}
