pipeline{
  
  agent any
  
  stages{
    
    stage("build"){
      when{
        expresssion{
          BRANCH_NAME == 'dev'
        }
      }
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
