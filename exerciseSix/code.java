package exerciseSix;

try {
    int x = 100 / 0;
} catch (ArithmeticException e) {
    String errorMessage = e.getMessage();
    System.out.println(errorMessage);
}
