pipeline {
	    agent any
	    tools {
	        maven 'maven_3_9_4' 
	    }
	    stages {
	        stage('Build Maven') {
	            steps {
	                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/namrata1681/devops-integration']]) 
	                bat 'mvn clean package'
	            }
	        }
	        stage('Build Docker Image') {
	            steps {
	                script {
	                    bat '''
	                    cd /d C:\\volkwagen\\devops_cicd\devops-automation-demo
	                    docker build -t devops-integration -f Dockerfile .
	                    '''
	                }
	            }
	        }
	        stage('Push Image to Hub'){
	            steps{
	                script{
                
	                    bat "docker login -u namrata16 -p stranger@16" 
	                    bat "docker tag devops-integration:latest namrata16/devops-integration:latest"
	                    bat 'docker push namrata16/devops-integration:latest'
	                }
	            }
	        }
	    }
	}
