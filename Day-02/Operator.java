
public class Operator {
    public static void main(String[] args) {
        int a = 10;
        int b=3;
        int c = 0;
        
        // Arithmetic Operator 
        c = a + b;
        System.out.println("Addition of a and b is: "+c);
        c= a-b;
        System.out.println("Subtraction of a and b is: "+c);
        c = a * b;
        System.out.println("Multiplication of a and b is: "+c);
        c = a / b;
        System.out.println("Division of a and b is: "+c);
        c=a%b;
        System.out.println("Modulus of a and b is: "+c);


        // Relational Operator
        System.out.println("Is a greater than b: "+(a>b));
        System.out.println("Is a less than b: "+(a<b));
        System.out.println("Is a equal to b: "+(a==b));
        System.out.println("Is a not equal to b: "+(a!=b));
        System.out.println("Is a greater than or equal to b: "+(a>=b));
        System.out.println("Is a less than or equal to b: "+(a<=b));

        // logical Operator
        System.out.println("If both are true --> result is true otherwise false--> " + (a==4 && b==3));
        System.out.println("If one are true --> result is true otherwise false--> " + (a==4 || b==3));
        System.out.println("It will print reverse of result--> " + !(a==4));

    }
}
