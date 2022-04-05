pipeline{
  
  agent any
  
  stages{
    
    stage('Checkout') {
      steps { //Checking out the repo
        checkout scm
      }
    }
    
    stage('Unit & Integration Tests') {
      steps {
        script {
          sh 'gradle clean test' //run a gradle task
        }
      }
    }
    
    stage("build"){
      steps{
        echo "building the Application..."
      }
    }
    
    stage("test"){
      steps{
        echo "testing the Application..."
      }
    }
    
    stage("deploy"){
      steps{
        echo "Deploy the Application..."
      }
    }
    
  }
}
