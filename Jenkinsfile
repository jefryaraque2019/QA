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

            // Publica el resultado de las pruebas
            junit 'target/surefire-reports/*.xml'

            // Guarda el reporte de Serenity como artefacto
            archiveArtifacts artifacts: 'target/site/serenity/**/*', fingerprint: true

            // Publica el reporte HTML de Serenity
            publishHTML(target: [
                allowMissing: false,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'target/site/serenity',
                reportFiles: 'index.html',
                reportName: 'Serenity Report'
            ])
        }
    }
}