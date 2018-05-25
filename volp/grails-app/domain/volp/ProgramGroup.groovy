package volp

class ProgramGroup {

    int group_number
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[organization:Organization,programgrouptype:ProgramGroupType]
    static hasMany = [program:Program]
    static constraints = {
    }
}
