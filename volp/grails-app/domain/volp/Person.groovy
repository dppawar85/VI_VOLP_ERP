package volp

class Person {
    String email   //primary email
    String grno
	String firstName
	String middleName
	String lastName
    String name_in_hindi
    String highest_qualification
    String skills
    String short_description
	Date date_of_birth
    boolean isphysicallyhandicapped    //Yes/No
    String father_full_name
    String mother_full_name
    String birth_place
    String native_place
    String aadhar_no
    String fullname_as_per_previous_marksheet
    boolean iscreamylayer     //Yes/No
    boolean is_exserviceman   //Yes/No
    boolean isbelongtogovernmentscheme     //Yes/No
    boolean is_having_gap_in_academic_year    //Yes/No
    String gap_in_academic_years   //comma separated academic years
    boolean iseducation_loan_availed   //Yes/No
    boolean is_sponsored_candidate   //Yes/No
    String username    
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address	
	static belongsTo=[gender:Gender,birthdistrict:ERPDistrict,birthstate:ERPState,birthcountry:ERPCountry,nativedistrict:ERPDistrict,nativestate:ERPState,nativecountry:ERPCountry,erpbloodgroup:ERPBloodGroup,mothertounge:ERPLanguage,university_area:ERPRegion]
    static hasMany = [logos : Logo,social:Social]
    static mapping = {
        isphysicallyhandicapped defaultValue: false
        iscreamylayer defaultValue: false
        is_exserviceman defaultValue: false
        isbelongtogovernmentscheme defaultValue: false
        is_having_gap_in_academic_year defaultValue: false
        iseducation_loan_availed defaultValue: false
        is_sponsored_candidate defaultValue: false
    }
    static constraints = {
        firstName nullable: true
        middleName nullable: true
        lastName nullable: true
        date_of_birth nullable: true
        gender nullable: true
        social nullable: true
        highest_qualification nullable: true
        short_description nullable: true
        skills nullable: true
        grno nullable:true
        email nullable:true
        name_in_hindi nullable:true
        father_full_name nullable:true
        mother_full_name nullable:true
        birth_place nullable:true
        birthdistrict nullable:true
        birthstate nullable:true
        birthcountry nullable:true
        native_place nullable:true
        nativedistrict nullable:true
        nativestate nullable:true
        nativecountry nullable:true
        erpbloodgroup nullable:true
        aadhar_no nullable:true
        mothertounge nullable:true
        university_area nullable:true
        fullname_as_per_previous_marksheet nullable:true
        gap_in_academic_years nullable:true
    }
}
