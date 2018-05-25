package volp

import grails.gorm.services.Service

@Service(DTEAllotmentList)
interface DTEAllotmentListService {

    DTEAllotmentList get(Serializable id)

    List<DTEAllotmentList> list(Map args)

    Long count()

    void delete(Serializable id)

    DTEAllotmentList save(DTEAllotmentList DTEAllotmentList)

}