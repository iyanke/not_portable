package SeveralTriggers.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object SeveralTriggers_BranchTriggers : BuildType({
    uuid = "520971d9-5c68-42f6-9ab4-26bfe49e9171"
    name = "Branch triggers"

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
