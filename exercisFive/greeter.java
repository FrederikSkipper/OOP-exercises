package exercisFive;

interface Greeting {
    void sayHello();

}

class Greeter implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Greeting g = new Greeter();
        g.sayHello();
    }

}