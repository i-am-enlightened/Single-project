pipeline{
    agent any

    stages{
        stage('Compile stage'){
            steps{
                withMaven(maven : 'apache-maven-3.6.3')
                    sh 'mvn clean'
            }
        }

        stage('Test stage'){
            steps{
                withMaven(maven : 'apache-maven-3.6.3')
                    sh 'mvn test'
            }
        }

        stage('Install stage'){
            steps{
                withMaven(maven : 'apache-maven-3.6.3')
                    sh 'mvn install'
            }
        }
    }
}