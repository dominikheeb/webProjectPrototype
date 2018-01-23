package WebProjectPrototype.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object WebProjectPrototype_Build : BuildType({
    uuid = "102d4ef6-4317-49af-82b1-8a2446b2cc8d"
    id = "WebProjectPrototype_Build"
    name = "Build"

    vcs {
        root(WebProjectPrototype.vcsRoots.WebProjectPrototype_HttpsGithubComDominikheebWebProjectPrototypeGitRefsHeadsMast)

    }

    triggers {
        vcs {
        }
    }
})
