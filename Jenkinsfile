pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean verify'
            }
        }

    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'

            archiveArtifacts artifacts: 'target/site/serenity/**/*', fingerprint: true
        }
    }
}