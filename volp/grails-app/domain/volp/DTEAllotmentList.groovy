package volp

class DTEAllotmentList {

    String applicationid
    String name_of_candidate
    String merit_no
    String mht_cet_score
    static belongsTo=[organization:Organization,gender:Gender,category:ERPStudentAdmissionMainCategory,erpshift:ERPShift,erpseattype:ERPSeatType,program:Program,academicyear:AcademicYear]
    static constraints = {
    }
}
