import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 6;
        int b = 0;

        // ------------try Catch Exception-----------------------------

        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // ------------WITH MULTIPLE Exception-----------------------------
        try {
            int c = a / b; // This line will throw ArithmeticException
        } catch (ArithmeticException | IllegalArgumentException illegalArgumentException) {
            illegalArgumentException.printStackTrace();  // This will print the stack trace of ArithmeticException

        }

        // finally
            
        // ------------Custom Exception-----------------------------

        try {
            int div = a / 0;
        } catch (Exception e) {
            DivisibleByZeroException exception = new DivisibleByZeroException("Divisble by zero");
            System.out.println("\n" + exception + "\n");
        }

        // ------------------------finally block -----------------------------------------
        finally{
            System.out.println("This will always run");
        }
    }
}


// finally : -> 
// the finally block is always running either exception is thrown or not