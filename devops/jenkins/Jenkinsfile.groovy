@Library('devopslib')
import org.cshion.MicroserviceJavaUtils;

def microServiceJavaUtils = new MicroserviceJavaUtils(this);

node{
    stage("Preparation"){
        checkout scm
    }

    stage("Build & Test"){
        microServiceJavaUtils.buildMavenProject();
    }

    stage("QA Analysis"){

    }

    stage("Deploy to DEV"){

    }

    stage("Upload Artifact"){

    }

    stage("Deploy to QA"){

    }

    stage("Functional Tests"){

    }

    stage("Non Functional Tests"){

    }

    stage("Promove Artifact"){

    }

    stage("Deploy to PROD"){

    }           
}
