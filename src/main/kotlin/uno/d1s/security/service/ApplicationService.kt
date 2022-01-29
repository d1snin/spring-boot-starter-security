package uno.d1s.security.service

import uno.d1s.security.domain.SimpleApplication
import uno.d1s.security.dto.SimpleApplicationCreationDto

interface ApplicationService {

    fun create(creation: SimpleApplicationCreationDto): SimpleApplication

    fun createRoot(): SimpleApplication

    fun find(id: String): SimpleApplication

    fun remove(id: String): SimpleApplication

    fun update(application: SimpleApplication): SimpleApplication
}