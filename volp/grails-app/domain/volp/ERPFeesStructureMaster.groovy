package volp

class ERPFeesStructureMaster
{
    double total_fees_amount
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[academicyear:AcademicYear,semester:Semester,organization:Organization,feescurrencytype:FeesCurrencyType,erpfeesdepositetype:ERPFeesDepositeType,erpstudentfeescategory:ERPStudentFeesCategory,program:Program,year:Year,erpstudenttype:ERPStudentType,erpcountry:ERPCountry,erpfeesaccountdetails:ERPFeesAccountDetails]
    static constraints = {
    }
}
