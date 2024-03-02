pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh "mvn clean package -DskipTests"
      }
    }
    stage('Build Docker image') {
      steps {
        sh "docker-compose up"
      }
    }
//     stage('Deploy') {
//       steps {
//         sh "docker run --name springboot-mapstruct -d -p 8080:8080 springboot-mapstruct:v1"
//       }
//     }
  }
}