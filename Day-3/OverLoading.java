class FindArea {

    double area(int r) {
        double area = 2 * 3.14 * r * r;
        return area;
    }

    double area(int length, int breadth) {
        return length * breadth;
    }

    double area(int length, int breadth, int height) {
        return length * breadth * height;
    }
}

public class OverLoading {
    public static void main(String[] args) {
FindArea findArea = new FindArea();
System.out.println();
        System.out.println("Area of Circle  : -->  "+findArea.area(3));
        System.out.println("Area of Reactangle  : -->  "+findArea.area(3, 12));
        System.out.println("Area of square  : -->  "+findArea.area(12, 3, 23));
    }
}
