

pipeline {
    agent any
    stages {
        
        stage('Configure'){
			    steps{
                    
                    echo "configure successfull"
			        
			    }
			        
				
			
			}
			stage('Find-Merge-Requests'){
			    steps{
                    
                    echo "merge request found"
			        
			    }
			
				
			}
			stage('SourceCode checkout'){
			    steps{
			        
                    
                    echo "sourceCOde check out successfull"
			    }
			
			
			}
        
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git url: 'https://github.com/naiveskill/devops.git', branch: 'main'
                // Change file permisson
                sh "chmod +x -R ./jenkins"
                // Run shell script
                sh "./jenkins/script/scripted_pipeline_ex_2.sh"
            }
        }
         stage('Code-Analysis') {
            steps {
                echo "Hello World"
            }
        }
	    
	 stage("Fortify Scan"){
		steps{
			
			echo "Fortify scan successfull"
			        
		}
			
			
	}
        stage('Quality_gate') {
            steps {
                echo "quality gate is successful"
		    
		
            }
        }
	 stage('Upload Artifact to Nexus'){
		steps{
			        
			echo " Upload Artifact to Nexus is successfull"   
		}
	}   
	 stage('Deploy-L1'){  
		steps{
			
			echo "Deploy-L1 is successfull"
			        
		}
			
			
	}
	stage('L1-Validate Env'){ 
		steps{
			
			echo "L1-Validate Env is successfull"
			        
		}
			
		
	}
	stage('L1-RegressionTest'){
		steps{
			
			echo "L1-RegressionTest is successfull"
			        
		}
			
			
	}    
	    
        
    }
}

