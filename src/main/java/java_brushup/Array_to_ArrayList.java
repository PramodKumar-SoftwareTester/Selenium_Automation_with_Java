package java_brushup;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Array_to_ArrayList {
    static void main(String[] args) {

        //Array to ArrayList

        String[] arr = {"Selenium","Java","Automation","Playwrite"};

        //List<String> arrval = Arrays.asList(arr); - Return with Fixed Size

       List<String> arrval = new ArrayList<>(Arrays.asList(arr));//convert to Array list with dynamic size
       arrval.add("Python");
       arrval.add("Typescript");
       System.out.println(arrval.contains("Java"));

       for(String val:arrval)
       {
           System.out.println(val);
       }




    }
}
