import elmo.jenkins.HelloWorld

// vars/HelloWorld.groovy
def call(String name) {
    def helloWorld = new HelloWorld(name)

    helloWorld.callName()
}
