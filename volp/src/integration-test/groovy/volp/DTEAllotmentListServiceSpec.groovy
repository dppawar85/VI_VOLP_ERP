package volp

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class DTEAllotmentListServiceSpec extends Specification {

    DTEAllotmentListService DTEAllotmentListService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new DTEAllotmentList(...).save(flush: true, failOnError: true)
        //new DTEAllotmentList(...).save(flush: true, failOnError: true)
        //DTEAllotmentList DTEAllotmentList = new DTEAllotmentList(...).save(flush: true, failOnError: true)
        //new DTEAllotmentList(...).save(flush: true, failOnError: true)
        //new DTEAllotmentList(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //DTEAllotmentList.id
    }

    void "test get"() {
        setupData()

        expect:
        DTEAllotmentListService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<DTEAllotmentList> DTEAllotmentListList = DTEAllotmentListService.list(max: 2, offset: 2)

        then:
        DTEAllotmentListList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        DTEAllotmentListService.count() == 5
    }

    void "test delete"() {
        Long DTEAllotmentListId = setupData()

        expect:
        DTEAllotmentListService.count() == 5

        when:
        DTEAllotmentListService.delete(DTEAllotmentListId)
        sessionFactory.currentSession.flush()

        then:
        DTEAllotmentListService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        DTEAllotmentList DTEAllotmentList = new DTEAllotmentList()
        DTEAllotmentListService.save(DTEAllotmentList)

        then:
        DTEAllotmentList.id != null
    }
}
