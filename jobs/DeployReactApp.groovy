//! Define your pipeline - of type pipeline
pipelineJob("Deploy-React-App"){
    description("Deploys a React web application to AWS")
    //! How long you want to keep your logs for & how many - stops Jenkins WS from getting blocked up
    logRotator {
        daysToKeep(5)
        numToKeep(20)
    }
    //! We don't want 2 builds happening at the same time - this stops project from building at same time
    concurrentBuild(allowConcurrentBuild = false)
    triggers {
      //! Want Jenkins to check this repo every minute and if there are changes, run a build
        scm("* * * * *"){
            ignorePostCommitHooks(ignorePostCommitHooks = false)
        }
    }
    parameters {
      stringParam("UNIQUE_ANIMAL_IDENTIFIER", defaultValue = "gelding", description = "Your unique animal identifier for this playground!")
    }
    definition {
    cpsScm {
      scm {
        git {
          branch("master")
          remote {
            credentials("${GIT_USER}")
            url("${GIT_URL}")
          }
        }
      }
      scriptPath('Jenkinsfile')
    }
  }
}