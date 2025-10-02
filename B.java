class B extends A {
    @Override
    public void print() {
/* Your one line code goes here */
    super.print();    
    System.out.println("B");
    }
    public static void main(String[] args) {
        new B().print();
        }
    }