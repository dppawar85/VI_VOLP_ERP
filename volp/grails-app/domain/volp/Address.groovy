package volp

class Address {

    String address
   // String country
   // String state
   // String district
   // String city
    String street
    String pin
    String hostel_name
    String hostel_address
    String username    
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[country:ERPCountry,state:ERPState,person:Person,district:ERPDistrict,city:ERPCity,addresstype:AddressType,organization:Organization]
    static constraints = 
    {
    	country size : 1 .. 30
    	state size : 1 .. 50
    	district size : 1 .. 50
    	city size : 1 .. 50
    	street size : 1 .. 50
    	pin size : 4 .. 10
        organization nullable:true
        address nullable:true
        person nullable:true
        addresstype nullable:true
        hostel_name nullable:true
        hostel_address nullable:true
    }
}
