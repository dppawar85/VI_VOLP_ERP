package volp

class ERPGRNumberProgramCode {

    String program_code
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[program:Program]
    static constraints = {
    }
}
