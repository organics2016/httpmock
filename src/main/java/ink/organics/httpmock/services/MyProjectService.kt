package ink.organics.httpmock.services

import com.intellij.openapi.project.Project
import ink.organics.httpmock.HTTPMockBundle

class MyProjectService(project: Project) {

    init {
        println(HTTPMockBundle.message("projectService", project.name))
    }
}
