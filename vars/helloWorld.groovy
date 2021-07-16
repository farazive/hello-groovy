// vars/helloWorld.groovy

import elmo.jenkins.HelloWorld

def call(String name) {
    def helloWorld = new HelloWorld(name)

    return helloWorld.callName()
}
