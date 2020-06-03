package Exceptions;

public class ExampleSeven {
    public static void main(String[] args) {
        try{
            System.out.println("In try");
            return;
        }
        finally {
            System.out.println("In finally");
        }
        //System.out.println("After try/catch/finally");
    }
}
