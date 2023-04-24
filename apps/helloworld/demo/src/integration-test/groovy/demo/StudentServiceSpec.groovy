package demo

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class StudentServiceSpec extends Specification {

    StudentService studentService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Student(...).save(flush: true, failOnError: true)
        //new Student(...).save(flush: true, failOnError: true)
        //Student student = new Student(...).save(flush: true, failOnError: true)
        //new Student(...).save(flush: true, failOnError: true)
        //new Student(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //student.id
    }

    void "test get"() {
        setupData()

        expect:
        studentService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Student> studentList = studentService.list(max: 2, offset: 2)

        then:
        studentList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        studentService.count() == 5
    }

    void "test delete"() {
        Long studentId = setupData()

        expect:
        studentService.count() == 5

        when:
        studentService.delete(studentId)
        sessionFactory.currentSession.flush()

        then:
        studentService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Student student = new Student()
        studentService.save(student)

        then:
        student.id != null
    }
}
