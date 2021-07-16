package elmo.jenkins

class HelloWorld
{
    private String name

    HelloWorld(String name) {
        this.name = name
    }

    def callName() {
        return this.name
    }

}
