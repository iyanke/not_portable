package SeveralTriggers

import SeveralTriggers.buildTypes.*
import SeveralTriggers.vcsRoots.*
import SeveralTriggers.vcsRoots.SeveralTriggers_HttpsGithubComIyankeNotPortableRefsHeadsMain
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "e91c47b4-165e-402e-9077-f519fc792a1e"
    id("SeveralTriggers")
    parentId("_Root")
    name = "Several Triggers"

    vcsRoot(SeveralTriggers_HttpsGithubComIyankeNew1refsHeadsMain)
    vcsRoot(SeveralTriggers_HttpsGithubComIyankeNotPortableRefsHeadsMain)

    buildType(SeveralTriggers_BranchTriggers)
    buildType(SeveralTriggers_BranchTriggersCopy)

    features {
        versionedSettings {
            id = "PROJECT_EXT_109"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "${SeveralTriggers_HttpsGithubComIyankeNotPortableRefsHeadsMain.id}"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
