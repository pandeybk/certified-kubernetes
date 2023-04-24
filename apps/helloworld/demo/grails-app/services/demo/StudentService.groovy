package demo

import grails.gorm.services.Service

@Service(Student)
interface StudentService {

    Student get(Serializable id)

    List<Student> list(Map args)

    Long count()

    void delete(Serializable id)

    Student save(Student student)

}