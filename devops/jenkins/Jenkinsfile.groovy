@Library('devopslib')
import org.cshion.MicroserviceJavaUtils;

def microServiceJavaUtils = new MicroserviceJavaUtils(this);

node{
    stage("Preparation"){
        checkout scm
    }

    stage("Build"){
        sh "./mvnw test-compile"
    }

    stage("Unit Testing"){
        sh "./mvnw test"
    }

    stage("QA Analysis"){
        
    }

    stage("Upload Artifact"){
        
    }

    stage("Deploy to DEV"){
       
    }  

}
