pipeline {
    agent any
    tools {
        maven 'Maven399'
        jdk 'jdk23'
    }
    stages {
        stage ('Initialize') {
            steps {
                bat '''
                    echo "PATH = %PATH%"
                    echo "M2_HOME = %M2_HOME%"
                '''
            }
        }

        stage ('Build') {
            steps {
                    bat 'cd monappli & mvn install'
            }
             post {
                success {
                    junit 'monappli/monappli-domaine/target/surefire-reports/*.xml'
                        }
                 }
               

           
            }
        }
    
}
