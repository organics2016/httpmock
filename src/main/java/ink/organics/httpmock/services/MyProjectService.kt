package ink.organics.httpmock.services

import com.intellij.openapi.project.Project
import ink.organics.httpmock.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
