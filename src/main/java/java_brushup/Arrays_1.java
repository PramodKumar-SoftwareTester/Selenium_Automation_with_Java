package java_brushup;

public class Arrays_1 {

    static void main(String[] args) {

        //Initialising Array
        //Arrays are group of Values with same data type

        int[] a = new int[4];//4 is size/length of the array, new is creating space for the array

        //assigning the values to arrays
        a[0]=1;
        a[1]=10;
        a[2]=20;
        a[3]=30;

        //Printng the array
        for(int i = 0; i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        /*
        we can use for each loop
        for(int arr:a)
        {
        sout(arr);
        }
         */

    }
}
