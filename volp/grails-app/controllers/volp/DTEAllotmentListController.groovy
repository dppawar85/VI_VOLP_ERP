package volp

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class DTEAllotmentListController {

    DTEAllotmentListService DTEAllotmentListService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond DTEAllotmentListService.list(params), model:[DTEAllotmentListCount: DTEAllotmentListService.count()]
    }

    def show(Long id) {
        respond DTEAllotmentListService.get(id)
    }

    def create() {
        respond new DTEAllotmentList(params)
    }

    def save(DTEAllotmentList DTEAllotmentList) {
        if (DTEAllotmentList == null) {
            notFound()
            return
        }

        try {
            DTEAllotmentListService.save(DTEAllotmentList)
        } catch (ValidationException e) {
            respond DTEAllotmentList.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'DTEAllotmentList.label', default: 'DTEAllotmentList'), DTEAllotmentList.id])
                redirect DTEAllotmentList
            }
            '*' { respond DTEAllotmentList, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond DTEAllotmentListService.get(id)
    }

    def update(DTEAllotmentList DTEAllotmentList) {
        if (DTEAllotmentList == null) {
            notFound()
            return
        }

        try {
            DTEAllotmentListService.save(DTEAllotmentList)
        } catch (ValidationException e) {
            respond DTEAllotmentList.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'DTEAllotmentList.label', default: 'DTEAllotmentList'), DTEAllotmentList.id])
                redirect DTEAllotmentList
            }
            '*'{ respond DTEAllotmentList, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        DTEAllotmentListService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'DTEAllotmentList.label', default: 'DTEAllotmentList'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'DTEAllotmentList.label', default: 'DTEAllotmentList'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
    def importdteallotmentlist()
    {
        println("I am in importdteallotmentlist..."+params)
    }
}
