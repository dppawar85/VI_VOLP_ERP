package volp

class ERPStudentBankDetails {

    String account_no
    String account_holder_name
    String branch_code
    String ifsc_code
    String branch_name
    String branch_address
    String pan_no
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[learner:Learner,erpbankname:ERPBankName,erpbankaccounttype:ERPBankAccountType,erpstate:ERPState,erpcity:ERPCity]
    static constraints = {
    }
}
