pipeline{
  
  agent any
  
  stages{
    
    stage("build"){
      when{
        expression{
          BRANCH_NAME == 'dev'
        }
      }
      steps{
        sh './gradlew clean test --no-daemon'
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
