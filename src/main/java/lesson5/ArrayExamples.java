package lesson5;

import java.util.*;

public class ArrayExamples {

//    public void stringsArray() {
//        String[] buttons = {"Ok", "Cancel", "Login", "SingUp"};

//        buttons[2]="Exit";

//        int length = buttons.length;

//        System.out.println(buttons[2]);
//        System.out.println("length " + length);
//
//        for (int i = 0; i<buttons.length; i++){
//            System.out.println(buttons[i]);
////        }
//    for (String button: buttons){
//        System.out.println(button);
//    }
//    }
//
//    public void stringsArrayWithSize() {
//        String[] array = new String[5];
//        array[0] = "OK";
//        array[1] = "Cancel";
//        array[2] = "Login";
//        array[3] = "SignUp";
//        array[4] = "Exit";
//        System.out.println("Length " + array.length);
//    }
//
//    public void integersArray() {
//        int[] ids = {12, 3, 8, 5};
//        System.out.println(ids[2]);
//    }
//
//    public void arrayListExample() {
//
//        ArrayList<String> buttons = new ArrayList<String>();
//
//        buttons.add("OK");
//        buttons.add("Cancel");
//        buttons.add("LogOut");
//        buttons.add("Exit");


//        for (int i = 0; i < buttons.size(); i++) {
//            System.out.println(buttons.get(i));


//            System.out.println("The size of the list " + buttons.size());
//            buttons.add("SingUp");
//        for (String button : buttons) {
//            System.out.println(button);
//        }
//        System.out.println();
//        buttons.remove("Exit");
//        for (String button : buttons) {
//            System.out.println(button);
//            System.out.println();
//    }
//        buttons.clear();
//        System.out.println(buttons.size());
//        }

            public void arrayListSortingExample() {

                ArrayList<Integer> arrayList = new ArrayList<Integer>();

                arrayList.add(15);
                arrayList.add(2);
                arrayList.add(50);
                arrayList.add(110);

                Collections.sort(arrayList);

                for (Integer i : arrayList) {
                    System.out.println(i);

                }

            }
            public void hashMapExample(){
                HashMap<String,String> hashMap = new HashMap<String,String>();
                hashMap.put("John", "Toronto");
                hashMap.put("Kate", "Moskow");
                hashMap.put("Moshe", "TelAviv");
                hashMap.put("Dasha", "Tomsk");
                System.out.println(hashMap);

                System.out.println(hashMap.get("Dasha"));
                hashMap.remove("Dasha");
                System.out.println(hashMap.size());

            }

            public void hashSetExample(){
                HashSet<String> hashSet = new HashSet<String>();
                hashSet.add("Lena");
                hashSet.add("Eva");
                hashSet.add("Ira");
                hashSet.add("Olga");
                System.out.println(hashSet);

                List<String> list = new ArrayList<String>(hashSet);
                Collections.sort(list);
                System.out.println(list);

            }
}