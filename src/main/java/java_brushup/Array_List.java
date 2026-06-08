package java_brushup;

import java.util.ArrayList;

public class Array_List {
    static void main(String[] args) {

        //to overcome the disadvantage of Array  - we use Array List

        ArrayList <String> a = new ArrayList<String>();//Created an Object from ArrayList Class

        a.add("Pramod");
        a.add("Kumar");
        a.add("HL");
        a.add("Gunan Saketh HP");
        //a.remove(2);

        //System.out.println(a.get(3));
        //System.out.println(a.size());

        //for loop
        for(int i=0; i<a.size();i++)
        {
            System.out.println(a.get(i));
        }

        System.out.println("********************");

        //for each
        for(String val:a)
        {
            System.out.println(val);
        }

        //is element Present in array List
        System.out.println(a.contains("Pramod"));
    }
}
