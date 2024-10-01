//  StringBuffer is thread safe and StringBuilder is not thread-safe

 public class StringBufferExample {
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        sb.delete(1, 3);
        String message = sb.toString();
        System.out.println(message);
    }
}