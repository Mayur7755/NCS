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
        stage('Quality_gate') {
            steps {
                echo "quality gate is successful"
            }
        }
        
    }
}
