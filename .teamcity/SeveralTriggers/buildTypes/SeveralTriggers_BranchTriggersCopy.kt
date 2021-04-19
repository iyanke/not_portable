package SeveralTriggers.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object SeveralTriggers_BranchTriggersCopy : BuildType({
    templates(SeveralTriggers_Template)
    uuid = "edf9969b-b773-4395-8349-664763097d7d"
    name = "Branch triggers_copy"
})
