package SeveralTriggers.buildTypes

import SeveralTriggers.vcsRoots.SeveralTriggers_HttpsGithubComIyankeThird1refsHeadsMain
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object SeveralTriggers_Build : BuildType({
    uuid = "bd0d8e9a-5302-482e-8a26-3318054d5a33"
    name = "Build"

    vcs {
        root(SeveralTriggers.vcsRoots.SeveralTriggers_HttpsGithubComIyankeThird1refsHeadsMain)
        root(SeveralTriggers.vcsRoots.SeveralTriggers_HttpsGithubComIyankeNew1refsHeadsMain)
        root(AbsoluteId("HttpUnit1413LabsIntelliJNetSvnArtifacts"))
    }

    triggers {
        vcs {
            quietPeriodMode = VcsTrigger.QuietPeriodMode.USE_CUSTOM
            quietPeriod = 10
            triggerRules = "+:root=${SeveralTriggers_HttpsGithubComIyankeThird1refsHeadsMain.id}:**"

            perCheckinTriggering = true
            enableQueueOptimization = false
        }
        vcs {
            quietPeriodMode = VcsTrigger.QuietPeriodMode.USE_CUSTOM
            quietPeriod = 600
            triggerRules = "+:root=HttpUnit1413LabsIntelliJNetSvnArtifacts:**"

        }
    }
})
