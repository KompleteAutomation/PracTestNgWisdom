pipeline{
	agent {
		docker{
			image 'maven:latest'
		}
		
	}
	
	environment{
		VERSION='0.5.2'
		REL_VER ='RES.4'
	}
	
	stages{
		stage('build'){
			steps{
				sh ''' 
					echo "This is Build with version as ${VERSION} and release as ${REL_VER}"
					java -version
					mvn -version
					ls
					
				
				'''
				
			
			
			}
		
		
						}
	stage('test'){
			steps{
				sh ''' 
					echo "This is TEST with version as ${VERSION} and release as ${REL_VER}"
				'''
			}
					}					
		}



}