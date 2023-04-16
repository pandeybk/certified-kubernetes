package dev.goglides.k8s

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class ApplicationController {

    ApplicationService applicationService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond applicationService.list(params), model:[applicationCount: applicationService.count()]
    }

    def show(Long id) {
        respond applicationService.get(id)
    }

    def create() {
        respond new Application(params)
    }

    def save(Application application) {
        if (application == null) {
            notFound()
            return
        }

        try {
            applicationService.save(application)
        } catch (ValidationException e) {
            respond application.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'application.label', default: 'Application'), application.id])
                redirect application
            }
            '*' { respond application, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond applicationService.get(id)
    }

    def update(Application application) {
        if (application == null) {
            notFound()
            return
        }

        try {
            applicationService.save(application)
        } catch (ValidationException e) {
            respond application.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'application.label', default: 'Application'), application.id])
                redirect application
            }
            '*'{ respond application, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        applicationService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'application.label', default: 'Application'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'application.label', default: 'Application'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
