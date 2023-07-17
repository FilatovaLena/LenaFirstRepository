package lesson5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class FilatovaM5 {
//    public static void stringArrays() {
//        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
//        int length = weekDays.length;
//        for (int i=0; i<weekDays.length; i++){
//            System.out.println(weekDays[i]);
//            System.out.println(weekDays[2]);
//        }

//    The online Toys store has 5 different products –
//    Batmobile (ID12),
//    Light Saber(ID45),
//    Wonder Woman (ID6),
//    Hello Kitty Bag(ID201),
//    and Junior QA Analyst Doll (ID56).
//    Each product has its own unique ID.
//    Please create a Method “public String getToyById(int id)”
//    which will build the hashmap of ids/products described above (Hashmap<Integer, String>)
//    and return the name of the toy by ID.
//    For example, calling getToyById(6) from the main method will return and print “Wonder Woman”.
//If there is no product with an id specified in the call,
// return “No such Toy” String instead.
// For example, calling getToyById(999) will return and print “No such Toy”.

     public String getToyById(int x) {
         String message="";
         HashMap<Integer, String> toy = new HashMap<Integer, String>();
         toy.put(12, "Batmobile");
         toy.put(45, "Light Saber");
         toy.put(6, "Wonder Woman");
         toy.put(201, "Hello Kitty Bag");
         toy.put(56, "Junior QA Analyst Doll");



         if (toy.get(x)==null) {
             message = "No such a toy";
         }else {
             message = toy.get(x);
         }

         return message;







//             }
//         }
//         System.out.println(" NO such toy");
//     }
//     }

//    The program should receive an ArrayList of Strings and print all the words with no duplicates.
//    for example: input
//    [Steve, Tim, Lucy, Steve, Pat, Angela, Tom, Tim, Anna, Lucy]
//        output:
//        [Steve, Tim, Lucy, Pat, Angela, Tom, Anna]

//    public void removeDuplicates() {
//
//        ArrayList<String> arrayList = new ArrayList<String>();
//        ArrayList<String> result = new ArrayList<String>();
//
//        arrayList.add("Steve");
//        arrayList.add("Tim");
//        arrayList.add("Lucy");
//        arrayList.add("Steve");
//        arrayList.add("Pat");
//        arrayList.add("Angela");
//        arrayList.add("Tom");
//        arrayList.add("Angela");
//        arrayList.add("Tim");
//        arrayList.add("Anna");
//        arrayList.add("Lucy");
//
//        Collections.sort(arrayList);
////        System.out.println(arrayList);
//
//        for (int i = 0; i < arrayList.size() - 1; i++) {
//            if (arrayList.get(i) != arrayList.get(i + 1)) {
//                result.add(arrayList.get(i));
//            }
//        }
//        System.out.println(result);

    }
}
