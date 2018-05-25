package volp

class Learner {
    String uid     //This should be similar to login.username   ..it can be gr number for ERP
	String registration_number
	String graduation_status
    String dte_application_number
    Date admission_date
    String username    
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address	
    static belongsTo=[person:Person,organization:Organization,current_module:Module,current_year:Year,program:Program,erpschoolboard:ERPSchoolBoard,erpspecialization:ERPSpecialization,erpadmissionquota:ERPAdmissionQuota,erpadmissiontype:ERPAdmissionType,erpshift:ERPShift,erpadmissionround:ERPAdmissionRound,allotederpstudentadmissionmaincategory:ERPStudentAdmissionMainCategory,allotederpstudentadmissionsubcategory:ERPStudentAdmissionSubCategory,erpdomacile:ERPDomacile,gender:Gender,admittederpstudentadmissionmaincategory:ERPStudentAdmissionMainCategory,admittederpstudentadmissionsubcategory:ERPStudentAdmissionSubCategory,erpnationality:ERPNationality,erpreligion:ERPReligion,erpcast:ERPCast,erpsubcast:ERPSubCast,erpmaritalstatus:ERPMaritalStatus,erpareatype:ERPAreaType
]
    static constraints = {
        registration_number nullable: true
        graduation_status nullable: true
        organization nullable: true
        current_module nullable: true
        program nullable: true
        current_year nullable: true
        erpschoolboard nullable: true
        erpspecialization nullable: true
        erpadmissionquota nullable: true
        erpadmissiontype nullable: true
        erpshift nullable: true
        erpadmissionround nullable: true
        allotederpstudentadmissionmaincategory nullable: true
        allotederpstudentadmissionsubcategory nullable: true
        erpdomacile nullable: true
        gender nullable: true
        admittederpstudentadmissionmaincategory nullable: true
        admittederpstudentadmissionsubcategory nullable: true
        erpnationality nullable: true
        erpreligion nullable: true
        erpcast nullable: true
        erpsubcast nullable: true
        erpmaritalstatus nullable: true
        erpareatype nullable: true
        dte_application_number nullable: true
        admission_date nullable: true
    }
}
