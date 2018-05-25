package volp

class ERPStudentFeesCategoryLogs {

    static belongsTo=[learner:Learner,academicyear:AcademicYear,year:Year,old_fees_category:ERPStudentFeesCategory,new_fees_category:ERPStudentFeesCategory]
    static constraints = {
    }
}
