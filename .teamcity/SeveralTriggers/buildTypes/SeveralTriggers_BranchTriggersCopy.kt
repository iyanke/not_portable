package SeveralTriggers.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object SeveralTriggers_BranchTriggersCopy : BuildType({
    uuid = "edf9969b-b773-4395-8349-664763097d7d"
    name = "Branch triggers_copy"

    vcs {
        root(SeveralTriggers.vcsRoots.SeveralTriggers_HttpsGithubComIyankeNew1refsHeadsMain)
    }

    steps {
        script {
            scriptContent = "echo %teamcity.build.branch%"
        }
    }

    triggers {
        vcs {
        }
        vcs {
            branchFilter = "+:branch1"
        }
        vcs {
            branchFilter = "+:branch3"
        }
        vcs {
            branchFilter = """
                +:*
                +:branch2
            """.trimIndent()
        }
    }
})
