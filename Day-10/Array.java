import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Array
 */
public class Array {

    public static void main(String[] args) {   

        // int arr[]=new int[5];
        // arr[0]=44;
        // arr[1]=3;
        // arr[4]=42;
        // int temp[] = Arrays.copyOf(arr, arr.length);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(temp));


        // -------------------ArrayList---------------------------

       List<Integer> list = new ArrayList<>();
       List<Integer> list2 = new ArrayList<>();
       list2.add(3);
       list2.add(3);
       list2.add(3);
        // return number of element
        list.add(44);
        list.add(14);
        list.add(4);
        int length=list.size();
       System.out.println(list.get(0));

        //remove the element
       list.remove("14");
       System.out.println(list.toString());
       
    //    adding list2 to list
       list.addAll(list2);
        System.out.println(list.toString());

        // add element to starting of list
        list.addFirst(1212);

        // adding end of list
        list.addLast(32323);

        System.out.println("After adding starting and ending element --> \n" + list.toString());

        //  remove all element from list
        list.clear();

        list.removeAll(list2);
        
    }
}