pipeline{
  
  agent any
  
  environment{
    NEW_VERSION = '1.3'
  }
  
  stages{
    
    stage("build"){
      when{
        expression{
          BRANCH_NAME == 'dev'
        }
      }
      steps{
        sh 'echo "building the Application..."'
      }
    }
    
    stage("test"){
      steps{
        echo "testing the Application..."
      }
    }
    
    stage("deploy"){
      steps{
        echo "Deploy the Application with Build Version $NEW_VERSION"
      }
    }
    
  }
}
