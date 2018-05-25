package volp

class ERPStudentFees {

    double componenet_amount_received
    double refund_amount
    double excess_amount
    static belongsTo=[erpfeesstructure:ERPFeesStructure,erpstudentfeesmaster:ERPStudentFeesMaster]
    static constraints = {
    }
}
