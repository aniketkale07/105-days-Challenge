public class Area {
    public static void main(String[] args) {
        Operation operation = new Operation();

        System.out.println("Area of Circle : "+operation.circle(5));
        System.out.println("Area of Rectangle : "+operation.rectangle(5, 6));
        System.out.println("Area of cube : "+operation.cube( 6.4f));  
    }
}
