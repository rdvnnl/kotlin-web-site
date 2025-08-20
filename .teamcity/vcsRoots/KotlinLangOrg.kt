package vcsRoots

//import common.extensions.VCS
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

//open class KotlinLangVcs(init: GitVcsRoot.() -> Unit) : GitVcsRoot({
//  url = "ssh://git@github.com/JetBrains/kotlin-web-site"
//  branch = VCS.branch("master")
//  branchSpec = "+:refs/heads/(*)"
//  authMethod = uploadedKey {
//    uploadedKey = "default teamcity key"
//  }
//  init()
//})
//
//object KotlinLangOrg : KotlinLangVcs({
//  name = "kotlinlang.org VCS root"
//})


object KotlinLangOrg: GitVcsRoot({
    name = "kotlinlang.org VCS root"
    url = "ssh://git@github.com/JetBrains/kotlin-web-site"
    branch = "refs/heads/master"
    branchSpec = "+:refs/heads/*"
    authMethod = uploadedKey {
        uploadedKey = "default teamcity key"
    }
})
