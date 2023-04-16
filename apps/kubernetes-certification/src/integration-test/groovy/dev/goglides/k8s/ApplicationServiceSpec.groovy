package dev.goglides.k8s

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ApplicationServiceSpec extends Specification {

    ApplicationService applicationService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Application(...).save(flush: true, failOnError: true)
        //new Application(...).save(flush: true, failOnError: true)
        //Application application = new Application(...).save(flush: true, failOnError: true)
        //new Application(...).save(flush: true, failOnError: true)
        //new Application(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //application.id
    }

    void "test get"() {
        setupData()

        expect:
        applicationService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Application> applicationList = applicationService.list(max: 2, offset: 2)

        then:
        applicationList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        applicationService.count() == 5
    }

    void "test delete"() {
        Long applicationId = setupData()

        expect:
        applicationService.count() == 5

        when:
        applicationService.delete(applicationId)
        sessionFactory.currentSession.flush()

        then:
        applicationService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Application application = new Application()
        applicationService.save(application)

        then:
        application.id != null
    }
}
