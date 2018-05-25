package volp

class ERPStudentFeesMaster {

    Date date_of_transaction
    String receipt_no
    String voucher_no
    String remark
    String dd_no
    Date dd_date
    String drawn_on_bank_name
    String bank_branch_name
    String utr_no
    static belongsTo=[learner:Learner,erppaymentmode:ERPPaymentMode,erpstudentfeescategorylinking:ERPStudentFeesCategoryLinking]
    static constraints = {
    }
}
