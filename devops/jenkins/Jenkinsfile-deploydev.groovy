@Library('devopslib')
import org.cshion.Utils;

def devopsUtils = new Utils(this);

node{
    stage("Configuration"){

    }

    stage("Build"){
        devopsUtils.buildMaven();
    }

    stage("Test"){

    }

    stage("QA Analysis"){

    }

    stage("Security Analysis"){

    }

    stage("Upload Artifact"){

    }

    stage("Deploy to Dev Env"){

    }
}