import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClass {
    public static void main(String[] args) {
        // // HashMap Implementation

        // HashMap<Integer, String> hashMap = new HashMap<>();

        // hashMap.put(4, "Aniket");
        // hashMap.put(2, "Sahil");
        // hashMap.put(2, "Anjali");
        // hashMap.put(1, "sam");
        // hashMap.put(8, "Mayank");

        // System.out.println(hashMap.toString());

        // // for
        // for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
        //     System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        // }

        // // check the ley is present or not
        // if (hashMap.containsKey(4)) {
        //     System.out.println("The Key is Present");
        // } else {
        //     System.out.println("The key is not present");
        // }

        // System.out.println(hashMap.get(3));

        // hashMap.remove(2);
        // System.out.println(hashMap.toString());
        
        // //  clear the whole hashmap
        // hashMap.clear();
        // System.out.println(hashMap.toString());



        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("A", "Apple");
        treeMap.put("B", "Banana");
        treeMap.put("C", "Cherry");
        treeMap.put("D", "Date");
        treeMap.put("E", "Elderberry");

        for(Map.Entry<String, String> tEntry : treeMap.entrySet()){
            System.out.println(" " + tEntry.getKey() + " : " + tEntry.getValue());
        }

        // for get any pair
        System.out.println(treeMap.get('D'));
        
        //  Remove 
        treeMap.remove("A");
        System.out.println(treeMap.toString());

        treeMap.replace("D", "Data");
        System.out.println(treeMap.toString());
    }
}
