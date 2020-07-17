// Possible with the `GitHub Pipeline Plugin`
@Library("github.com/figaw/jenkins-shared-libraries@master") _

def myConstant = usingStaticHelper.thisUsesAStaticHelperFunction()

node {
    stage("stage1"){
        echo usingStaticHelper.thisUsesAStaticHelperFunction()
    }

    stage("stage2"){
        echo "It's even available here: $myConstant"
    }
}
