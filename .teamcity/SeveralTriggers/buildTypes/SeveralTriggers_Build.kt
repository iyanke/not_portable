package SeveralTriggers.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object SeveralTriggers_Build : BuildType({
    uuid = "bd0d8e9a-5302-482e-8a26-3318054d5a33"
    name = "Build"

    vcs {
        root(SeveralTriggers.vcsRoots.SeveralTriggers_HttpsGithubComIyankeThird1refsHeadsMain)
    }

    triggers {
        vcs {
        }
    }
})
