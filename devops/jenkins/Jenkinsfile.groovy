@Library('devopslib@master')
import org.cshion.MicroserviceJavaUtils;

def microServiceJavaUtils = new MicroserviceJavaUtils(this);

node{
    stage("Preparation"){
        checkout scm
    }

    stage("Build"){
        microServiceJavaUtils.buildMavenProject();
    }

    stage("Unit Testing"){
        microServiceJavaUtils.runMavenUnitTest();
    }

    stage("QA Analysis"){
        microServiceJavaUtils.uploadArtifact();
    }

    stage("Upload Artifact"){
        microServiceJavaUtils.runStaticAnalysis();
    }

    stage("Deploy to DEV"){
        microServiceJavaUtils.deployToAks();
    }  

}
