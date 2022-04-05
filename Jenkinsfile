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
        sh 'gradlew clean build'
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
