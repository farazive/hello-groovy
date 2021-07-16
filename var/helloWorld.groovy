import elmo.jenkins.HelloWorld

// vars/helloWorld.groovy
def call(String name) {
    def helloWorld = new HelloWorld(name)

    helloWorld.callName()
}
