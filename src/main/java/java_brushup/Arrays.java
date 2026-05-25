package java_brushup;

import java.util.Scanner;

public class Arrays {
    static void main(String[] args) {

        //Arrays

        int[] arr = new int[5]; // left is declaring the array and right is memory allocation
        //assigning the values to Array - 1st type
        arr[0]=1; arr[1]=2; arr[2]=3; arr[3]=4; arr[4]=5;
        System.out.println(arr[2]);// out put

        int[] arr2 = {6,5,4,3,2};//2nt type assigning and declaring the array
       // System.out.println(arr2[4]);
        for(int i=0; i<arr2.length;i++)
        {
            System.out.println(arr2[i]);
        }

        //by using Scanner - declaring and assigning through the scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the array");
        int n= sc.nextInt();
        int[] arr3 = new int[n];

        System.out.println("enter the array values");
        for(int i=0;i<n;i++)
        {
            arr3[i]=sc.nextInt();
        }

        //out put
        System.out.println("the array is");
        System.out.print("{");
        for(int j=0; j<n; j++)
        {
            System.out.print(arr3[j]+", ");
        }
        System.out.println("}");

        String[] arrs = new String[7];

        arrs[0]="Testing";
        arrs[1]="Testing,1";
        arrs[2]="Testing,2";
        arrs[3]="Testing,3";
        arrs[4]="Testing,4";
        arrs[5]="Testing,5";
        arrs[6]="Testing,6";

        String[] arrs1={"Test","Automation","with","Java"};

        for(int k=0;k<arrs.length;k++)
        {
            System.out.println(arrs[k]);
        }


    }
}
