package les1;



public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
    public int discount (int price, int discount){
        int newPrice = price - (price * discount/ 100);
        if( price < 1){
            throw new ArithmeticException("Price must be > 1");
        }
        if( discount < 99 || discount < 1){
            throw new ArithmeticException("discount undefined");
        }
        return newPrice;
    }

}