// Possible with the `GitHub Pipeline Plugin`
@Library("github.com/figaw/jenkins-shared-libraries@test") _

node {
    stage("stage1"){
        echo usingHelper.thisUsesAHelperFunction()
    }
}
