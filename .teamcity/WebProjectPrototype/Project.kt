package WebProjectPrototype

import WebProjectPrototype.buildTypes.*
import WebProjectPrototype.vcsRoots.*
import WebProjectPrototype.vcsRoots.WebProjectPrototype_HttpsGithubComDominikheebWebProjectPrototypeGitRefsHeadsMast
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "457ee445-aa7f-46f3-8b3c-8239fa7ad76b"
    id = "WebProjectPrototype"
    parentId = "_Root"
    name = "WebProjectPrototype"

    vcsRoot(WebProjectPrototype_HttpsGithubComDominikheebWebProjectPrototypeGitRefsHeadsMast)

    buildType(WebProjectPrototype_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_3"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = WebProjectPrototype_HttpsGithubComDominikheebWebProjectPrototypeGitRefsHeadsMast.id
            showChanges = true
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
