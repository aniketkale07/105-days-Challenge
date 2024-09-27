

public class ConstructorOverloading {
    public static void main(String[] args) {
        Area area = new Area(4);
        Area area2 = new Area(3, 4);
        Area area3 = new Area(1, 3, 6);
    }
}

/*
 * InnerConstructorOverloading
 */
 class Area {

    Area(int r){
        double area = 2* 3.14 * r * r;
        System.out.println("Area of Circle :"+ area);
    }

    Area(int l, int b){
        System.out.println("Area of square : " + l*b);
    }
    
    Area(int l , int b, int h){
        System.out.println("Area of Cube" + + l * b *h);
    }
    
}