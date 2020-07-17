// Possible with the `GitHub Pipeline Plugin`
@Library("github.com/figaw/jenkins-shared-libraries@master") _

node {
    stage("stage1"){
        echo basic.thisIsAFunction()
    }
}
