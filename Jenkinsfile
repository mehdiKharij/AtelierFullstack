pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/mehdiKharij/AtelierFullstack.git', branch: 'main'
            }
        }

        stage('Display Message') {
                    steps {
                        // Display a message indicating successful Git checkout
                        echo 'Git checkout successful! Repository cloned.'
                    }
                }

        stage('Build') {
            steps {
                bat '"C:\\Program Files\\apache-maven-3.9.9\\bin\\mvn" clean install'

            }
        }

        stage('mvn clean package successful passed') {
                    steps {
                        // Display a message indicating successful Git checkout
                        echo 'mvn clean install!'
                    }
                }


    }

    //comment test
}