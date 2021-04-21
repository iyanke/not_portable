package SeveralTriggers.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object SeveralTriggers_HttpsGithubComIyankeThird1refsHeadsMain : GitVcsRoot({
    uuid = "3a20ffa5-8181-4262-b0d2-d14085078584"
    name = "https://github.com/iyanke/third1#refs/heads/main"
    url = "https://github.com/iyanke/third1"
    branch = "refs/heads/main"
    branchSpec = "refs/heads/*"
    authMethod = password {
        userName = "iyanke"
        password = "credentialsJSON:8d1f55b6-366f-4827-806e-c8d40f4ca4da"
    }
})
