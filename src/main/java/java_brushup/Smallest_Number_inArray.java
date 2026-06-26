package java_brushup;

public class Smallest_Number_inArray {
    static void main(String[] args) {

        //array initialisation
        int arr[] = {5,100,200,3,7,1,400,500};

        //smallest number in array

        int min = arr[0];//taking minimum

        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }

        System.out.println("smallest number of the array is: " + min);
    }
}
