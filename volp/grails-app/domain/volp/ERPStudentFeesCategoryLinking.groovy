package volp

class ERPStudentFeesCategoryLinking {

    static belongsTo=[learner:Learner,erpstudentfeescategory:ERPStudentFeesCategory,academicyear:AcademicYear,year:Year]
    static constraints = {
    }
}
