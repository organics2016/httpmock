package com.github.organics2016.httpmock.services

import com.intellij.openapi.project.Project
import com.github.organics2016.httpmock.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
