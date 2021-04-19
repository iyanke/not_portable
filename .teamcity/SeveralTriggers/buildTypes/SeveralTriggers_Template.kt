package SeveralTriggers.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object SeveralTriggers_Template : Template({
    uuid = "656fd993-2e28-49bc-bba2-3f21f6e64829"
    name = "Template"

    vcs {
        root(SeveralTriggers.vcsRoots.SeveralTriggers_HttpsGithubComIyankeNew1refsHeadsMain)
    }

    steps {
        script {
            id = "RUNNER_1"
            scriptContent = "echo %teamcity.build.branch%"
        }
    }

    triggers {
        vcs {
            id = "TRIGGER_1"
        }
        vcs {
            id = "TRIGGER_2"
            branchFilter = "+:branch1"
        }
        vcs {
            id = "TRIGGER_3"
            branchFilter = "+:branch3"
        }
        vcs {
            id = "TRIGGER_4"
            branchFilter = """
                +:*
                +:branch2
            """.trimIndent()
        }
    }
})
