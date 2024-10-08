public class DivisibleByZeroException extends Exception {

    public  DivisibleByZeroException (String msg){
        super(msg);
    }
    
    DivisibleByZeroException(String msg, Throwable throwable){
        super(msg, throwable);
    }
}
