package volp

class ERPDocuments {
    String documentpath
    String documentname
    String remark
    String username
    Date creation_date
    Date updation_date
    String creation_ip_address
    String updation_ip_address
    static belongsTo=[learner:Learner,erpdocumenttype:ERPDocumentType]
    static constraints = {
    }
}
