/**
 * DataTypes
 */

public class DataTypes {
public static void main(String[] args) {
    // Primitive Data Types
    int a = 10; // int
    float b = 20.5f; // float
    char c = 'A'; // char
    boolean d = true; // boolean
    byte e = 10; // byte
    short f = 20; // short
    long g = 30L; // long
    double h = 40.5; // double

    // non Primitive dataTypes 
    String i = "Hello"; // String
    int arr[] = {3,2,4,3,3};
    
    //  Creating object
    DataTypes dataTypes = new DataTypes();  // datatype is object of DataType Class
    dataTypes.display(); 
    

    //---------------Wrapper Class---------------
    Integer x =10;  // int --> Integer
    Float y = 20.5f; // float --> Float
    Character z = 'A'; // char --> Character
    Boolean w = true; // boolean --> Boolean
    Byte v = 10; // byte --> Byte
    Short u = 20; // short --> Short
    Long l = 30L; // long --> Long
    Double m = 40.5; // double --> Double

    // AutoBoxing   --> primitive to object Class (Wrapper)
    Integer p = 10; // primitive to object class
    System.out.println(p); // output 10
    System.out.println(p.getClass().getName()); // output Integer
    System.out.println(p instanceof Integer); // output true
    System.out.println(p instanceof Object); // output true

    // Unboxing
    int q = p; // object class to primitive
    System.out.println(q); // output 10
    
    
}
    
public void display(){
    System.out.println("Hello");
}
}