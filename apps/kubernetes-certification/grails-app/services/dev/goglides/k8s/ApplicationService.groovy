package dev.goglides.k8s

import grails.gorm.services.Service

@Service(Application)
interface ApplicationService {

    Application get(Serializable id)

    List<Application> list(Map args)

    Long count()

    void delete(Serializable id)

    Application save(Application application)

}