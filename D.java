public class D extends C {
@Override
public void m1() {
System.out.println("D.m1()");
}
public static void m2() {
System.out.println("D.m2()");
}
public static void main(String[] args) {
C c = new D();
c.m1(); // outputs:  D.m1() (Non sattic therefore overriden by subclass method)
c.m2(); // outputs: C.m2 (Static thefore can not override)
((D)c).m2(); // outputs:  D.m2() (Subclass access property c from class C, but m2 is still static sot no override)
C.m2(); // output: C.m2
D.m2(); // outputs: D.m2()
    }
}