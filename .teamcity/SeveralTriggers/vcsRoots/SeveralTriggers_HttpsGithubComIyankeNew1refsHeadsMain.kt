package SeveralTriggers.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object SeveralTriggers_HttpsGithubComIyankeNew1refsHeadsMain : GitVcsRoot({
    uuid = "e680c0db-e449-46e4-91a6-681b49f2aece"
    name = "https://github.com/iyanke/new1#refs/heads/main"
    url = "https://github.com/iyanke/new1"
    branch = "refs/heads/main"
    branchSpec = "refs/heads/*"
    authMethod = password {
        userName = "iyanke"
        password = "credentialsJSON:8d1f55b6-366f-4827-806e-c8d40f4ca4da"
    }
})
