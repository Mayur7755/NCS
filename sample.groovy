def call(config){
library 'reference-pipeline'
	pipeline{
	
		
		stages{
			stage('is Load Master?'){
			    steps{
			        
			            echo "welcome"
			    }
			
			}
			stage('Configure'){
			    steps{
			        
			    }
			
				
			
			}
			stage('Find-Merge-Requests'){
			    steps{
			        
			    }
			
				
			}
			stage('SourceCode checkout'){
			    steps{
			        
			    }
			
			
			}
			stage('Build'){
			    steps{
			        
			    }
			
			   
			}
			stage('CodeAnalysis'){
			    steps{
			        
			    }
			
		
			 }
			stage("Fortify Scan"){
			    steps{
			        
			    }
			
			
			}
			stage('Run Fortify Analysis'){
			    steps{
			        
			    }
			
		
			}
			stage("Quality Gate"){
			    steps{
			        
			    }
			
				
			}
			stage('Upload Artifact to Nexus'){
			    steps{
			        
			    }
			
	                        
			}
			stage("Raise-Merge-Requst?"){
			    steps{
			        
			    }
			
		
			}	
			stage('Merge-Request-Sent'){
			    steps{
			        
			    }
			
			
				}
			stage('Deploy-L1'){  
			    steps{
			        
			    }
			
			
			}
			stage('L1-Validate Env'){ 
			    steps{
			        
			    }
			
		
			}
			stage('L1-RegressionTest'){
			    steps{
			        
			    }
			
			
			}   
			stage('L2-LoadMaster Approval'){
			    steps{
			        
			    }
			
			                    
			}
			stage('Deploy-L2') {
			    steps{
			        
			    }
			
				
			
			}
			stage('L2-Validate Env'){ 
			    steps{
			        
			    }
			
			
			}
			stage('L2-goldenTest'){
			    steps{
			        
			    }
			
			
			}
			stage('L3-LoadMaster Approval'){
			    steps{
			        
			    }
			
				                     
			}
			stage('Deploy-L3') {
			    steps{
			        
			    }
			
			
			}
			stage('L3-Validate Env'){ 
			    steps{
			        
			    }
			
			
			}
			stage('L3-goldenTest'){
			    steps{
			        
			    }
			
		
			}
			stage('L4-LoadMaster Approval'){
			    steps{
			        
			    }
			
			
			}
			stage('Deploy-L4') {
			    steps{
			        
			    }
			
			
			} 
			stage('L4-Validate Env'){ 
			    steps{
			        
			    }
			
			
			}
			stage('L4-goldenTest'){
			    steps{
			        
			    }
			
			
			}
			stage('L6-LoadMaster Approval'){
			    steps{
			        
			    }
			
		
			}			
			stage('Deploy-L6') {
			    steps{
			        
			    }
			
			
			}
			stage('L6-Validate Env'){
			    steps{
			        
			    }
			
			
			}
			stage('L6-goldenTest'){
			    steps{
			        
			    }
			
			
		    }  
		post{
			
		}
	}
}
}

