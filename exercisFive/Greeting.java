package exercisFive;

public interface Greeting {
default void greet() {
    System.out.println("Hello");
    }
}
public class EnglishGreeting implements Greeting {
    }

public class HispanicGreeting implements Greeting {
@Override
public void greet() {
    System.out.println("Ola");
    }
}

/* 
What is the outputs of the following code?
-------------------------------------------
Greeting usGreeting = new EnglishGreeting();  
Greeting mxGreeting = new HispanicGreeting();
usGreeting.greet(); ANSWER: "Hello"
mxGreeting.greet(); ANSWER: We cant override to "ola" becouse a method in an instance with a body is static = "Hello"
 */
