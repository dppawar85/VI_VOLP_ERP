package volp

class Login {

    String username   //email
    String password
    String grno_empid
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    boolean isloginblocked       
    static belongsTo=[socialaccounttype:SocialAccountType]
    static hasMany = [roles: Role,usertype:UserType]
    static constraints = {
    	//username unique : true, blank: false
        username nullable:true
        socialaccounttype nullable:true
        grno_empid nullable:true
    }
}
