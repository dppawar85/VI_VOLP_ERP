package volp
class Contact 
{
    String email
	String mobile_no   //primary mobile no
    String ulternate_mobile_no      //secondary mobile number
	String alternate_email    //secondary email
	String telephone_no   //phone number
    String fax
    String website_url
    String emergency_contact_name
    String emergency_contact_address
    String emergency_contact_primary_mobile
    String emergency_contact_secondary_mobile
    String emergency_contact_phone
    String emergency_contact_remark
    String local_guardian_name
    String local_guardian_address
    String local_guardian_primary_mobile
    String local_guardian_secondary_mobile
    String local_guardian_phone
    String local_guardian_remark
    String whatsappnumber
    String username    
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[person:Person,organization:Organization,emergency_contact_city:ERPCity,local_guardian_city:ERPCity]
    static constraints = {
    	mobile_no size : 10 .. 15
        ulternate_mobile_no size : 10 .. 15
    	alternate_email email : true
    	telephone_no size : 5 .. 15
    	fax size : 5 .. 15
    	website_url size : 0 .. 100
        organization nullable:true
        emergency_contact_name nullable:true
        emergency_contact_address nullable:true
        emergency_contact_primary_mobile nullable:true
        emergency_contact_secondary_mobile nullable:true
        emergency_contact_phone nullable:true
        emergency_contact_remark nullable:true
        emergency_contact_city nullable:true
        local_guardian_name nullable:true
        local_guardian_address nullable:true
        local_guardian_primary_mobile nullable:true
        local_guardian_secondary_mobile nullable:true
        local_guardian_phone nullable:true
        local_guardian_remark nullable:true
        local_guardian_city nullable:true
        whatsappnumber nullable:true
        email nullable:true
    }
}
