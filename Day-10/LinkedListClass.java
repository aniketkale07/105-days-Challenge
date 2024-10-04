import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {
    public static void main(String[] args) {
       
        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(34);
        linkedList.add(14);
        linkedList.add(114);
        linkedList.add(1411);
        linkedList.add(343);

        if(linkedList.isEmpty()){
            System.out.println("List is Empty...");
        }else{
            System.out.println(linkedList.toString());
        }
        
        // add element at specfic position
        linkedList.add(2, 2323);
        
        linkedList.addFirst(12);
        linkedList.addLast(999);

        linkedList.remove(4);
        System.out.println("After Removing  element : "+linkedList.toString());
        
        linkedList.removeFirst();
        System.out.println("After Removing First element : "+linkedList.toString());
        
        linkedList.removeFirst();
        System.out.println("After Removing Last element : "+ linkedList.toString());
        
        System.out.println(" Reversed  LinkedList : "+linkedList.reversed());
    }
}
