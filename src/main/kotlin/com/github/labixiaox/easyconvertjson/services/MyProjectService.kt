package com.github.labixiaox.easyconvertjson.services

import com.intellij.openapi.project.Project
import com.github.labixiaox.easyconvertjson.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
