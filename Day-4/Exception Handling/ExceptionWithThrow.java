public class ExceptionWithThrow  {
    
    class InnerExceptionWithThrow {
       
        InnerExceptionWithThrow() throws ArithmeticException {
            int c = 45/0;
        }
        
    }
    
   
    
    public static void main(String[] args) {
        try {
            ExceptionWithThrow exceptionWithThrow = new ExceptionWithThrow();
            InnerExceptionWithThrow innerExceptionWithThrow = exceptionWithThrow.new InnerExceptionWithThrow();
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

    }
}