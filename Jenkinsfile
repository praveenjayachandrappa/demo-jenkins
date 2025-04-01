pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/praveenjayachandrappa/demo-jenkins.git'
            }
        }
       
        stage('Build') {
            steps {
                echo 'Building the project...'
                sh 'mvn clean package' // Change this based on your project type
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'mvn test' // Change this for your testing framework
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application...'
                // Add deployment script here (e.g., copying files, Docker, Kubernetes)
            }
        }
    }

    post {
        success {
            echo 'Pipeline executed successfully!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}
