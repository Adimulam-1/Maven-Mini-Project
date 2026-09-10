pipeline{
    agent any
    stages {
        stage ('checkout') {
            steps {
                checkout scm
            }
        }
        stage ('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage ('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage ('SonarQube') {
            steps {
                sh 'mvn sonar:sonar'
            }
        }
        stage ('Archive Articaft') {
            steps {
                 archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }
}
