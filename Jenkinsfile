pipeline{
  
  agent any
  
  stages{
    
    stage('Checkout') {
      steps { //Checking out the repo
        git branch: 'dev'
      }
    }
    
    stage('Unit & Integration Tests') {
      steps {
        script {
          sh './gradlew clean test --no-daemon' //run a gradle task
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
