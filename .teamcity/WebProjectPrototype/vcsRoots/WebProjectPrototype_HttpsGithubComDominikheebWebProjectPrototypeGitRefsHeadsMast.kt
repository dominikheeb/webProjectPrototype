package WebProjectPrototype.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object WebProjectPrototype_HttpsGithubComDominikheebWebProjectPrototypeGitRefsHeadsMast : GitVcsRoot({
    uuid = "0cb6230a-030c-4c5f-847c-0e1c22596e20"
    id = "WebProjectPrototype_HttpsGithubComDominikheebWebProjectPrototypeGitRefsHeadsMast"
    name = "https://github.com/dominikheeb/webProjectPrototype.git#refs/heads/master"
    url = "https://github.com/dominikheeb/webProjectPrototype.git"
    branchSpec = "+:refs/heads/*"
    authMethod = password {
        userName = "dominikheeb"
        password = "credentialsJSON:bd85f2d5-1301-48d9-b8e2-9cbe231293e7"
    }
})
