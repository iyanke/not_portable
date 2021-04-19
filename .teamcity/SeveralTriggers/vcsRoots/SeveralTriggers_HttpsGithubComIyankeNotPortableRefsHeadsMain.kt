package SeveralTriggers.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object SeveralTriggers_HttpsGithubComIyankeNotPortableRefsHeadsMain : GitVcsRoot({
    uuid = "f5dfe372-c736-4516-ab65-f733dd505910"
    name = "https://github.com/iyanke/not_portable#refs/heads/main"
    url = "https://github.com/iyanke/not_portable"
    branch = "refs/heads/main"
    authMethod = password {
        userName = "iyanke"
        password = "credentialsJSON:8d1f55b6-366f-4827-806e-c8d40f4ca4da"
    }
})
