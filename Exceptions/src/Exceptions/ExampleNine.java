package Exceptions;

public class ExampleNine {
    public static void main(String[] args) {
        try {
            System.out.println("In try");
            System.exit(0);
        }
        finally {
            System.out.println("In finally");
        }
        System.out.println("After try/finally");
    }
}
