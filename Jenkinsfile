#!/usr/bin/env groovy

node('linux && maven && gpg') {
    ansiColor('xterm') {
        stage('Checkout') {
            git([
                url: 'https://github.com/bitbar/opencv-library.git',
                branch: env.BRANCH,
                poll: true
            ])
        }

        stage('Build') {
            sh("""mvn clean \
                      package \
                      source:jar \
                      javadoc:jar \
                      verify \
                      deploy:deploy \
                      -DaltDeploymentRepository=ossrh::default::https://oss.sonatype.org/service/local/staging/deploy/maven2/
            """)
        }
    }
}
