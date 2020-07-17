// Possible with the `GitHub Pipeline Plugin`
@Library("github.com/figaw/jenkins-shared-libraries@test") _

def myConstant = usingHelper.thisUsesAHelperFunction()

node {
    stage("stage1"){
        echo usingHelper.thisUsesAHelperFunction()
    }

    stage("stage2"){
        echo "It's even available here: $myConstant"
    }
}
