package exercisFive;

@FunctionalInterface
public interface Printer {
public void print();
public default void sayHello() {
System.out.println("Hello");
    }
}

// Is this a valid functional interface decloration?
// Yes Print is abstract becouse no body, while sayhello has body. 
