pipeline {
    agent any

    environment {
        BASEPATH = pwd()
    }

    stages {
        stage('Pre-build') {
            parallel {
                stage('Code Quality') {
                    steps {
                        echo 'Running Code Quality checks...'
                        sleep 3
                    }
                }
                stage('Unit Tests') {
                    steps {
                        echo 'Running unit tests...'
                        sleep 3
                    }
                }
            }
    	}
        stage('Provision to CI Env') {
            parallel {
                stage('DB') {
                    steps {
                        echo 'DB Provisioning...'
                        sleep 3
                    }
                }
                stage('Wiremock SV') {
                    steps {
                        echo 'Wiremock provisioning...'
                        sleep 3
                    }
                }
            }
    	}
        stage('Deploy to CI Env.') {
            steps {
                echo "Deploying to CI Env..."
                sleep 3
            }
        }
        stage('MAGiX Tests') {
            parallel {
                stage('Acceptance') {
                    agent {
                        docker {
                            image 'maven:3.8.6-openjdk-8-slim'
                            // args '-u root --privileged'
                            // args '-v ${BASEPATH}@2/acceptance_reports:/magix/Reports'
                        }
                    }
                    steps {
                        // sh 'java -jar /magix/MAGiX.jar -u TestArtefacts -testcase "checkbox.csv[split],varCreation.csv[split],FrameHandling.csv[split]" -PassPercentage 100 -p'
                        // sh 'cd /magix; java -jar MAGiX.jar -u TestArtefacts/ -e EnvironmentDetails.properties -testcase "checkbox.csv[split]" -PassPercentage 100 -p'
                        sh 'mvn test'
                        // sleep 13
                        publishHTML target: [
                            allowMissing: false,
                            alwaysLinkToLastBuild: false,
                            keepAll: true,
                            reportDir: 'acceptance_reports',
                            reportFiles: 'index.html',
                            reportName: 'MAGiX Acceptance Tests'
                        ]
                    }
    	        }
                stage('Regression') {
                    agent {
                        docker {
                            image 'techm/magix:0.07'
                            // args '-u root --privileged'
                            args '-v ${BASEPATH}@2/regression_reports:/magix/Reports'
                        }
                    }
                    steps {
                        //sh 'java -jar /magix/MAGiX.jar -u TestArtefacts -testcase "varCreation.csv[split],FrameHandling.csv[split]" -PassPercentage 100 -p'
                        sh 'echo Regression'
                        sleep 19
                        publishHTML target: [
                            allowMissing: false,
                            alwaysLinkToLastBuild: false,
                            keepAll: true,
                            reportDir: 'regression_reports',
                            reportFiles: 'index.html',
                            reportName: 'MAGiX Regression Tests'
                        ]
                    }
    	        }
            }
        }
    	stage('Cleanup CI') {
            steps {
                echo "Cleaning up the resources..."
                sleep 3
            }
        }
        stage('Provision to Trial Env.') {
            parallel {
                stage('JMeter') {
                    steps {
                        echo 'JMeter provisioning...'
                        sleep 3
                    }
                }
            }
    	}
        stage('Deploy to Trial Env.') {
            steps {
                sh 'echo deploying...'
            }
    	}
        stage('JMeter Perf Tests') {
            steps {
                sh 'echo deploying...'
            }
    	}
        stage('Cleanup Trial') {
            steps {
                echo "Cleaning up the resources..."
                sleep 3
            }
        }
    }
}