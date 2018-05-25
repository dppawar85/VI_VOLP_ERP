package volp

class RoleType {

    String type  //modules
    boolean isroletypeset
    String username    
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[applicationtype:ApplicationType]
    static constraints = {
    	type nullable:false
    }
}
