package volp

class Social {

    String site_url    //facebook, twitter, linkeddin, skype
    String site_username
    String siteid
    String username    
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address    
    static constraints = {
    	site_url size : 1 .. 50
    	site_username size : 1 .. 50
        siteid nullable:true
    }
}
