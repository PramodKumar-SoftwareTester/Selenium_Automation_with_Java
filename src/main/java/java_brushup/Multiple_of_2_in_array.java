package java_brushup;

public class Multiple_of_2_in_array {
    static void main(String[] args) {

        int[] arr = {1,1,2,3,4,6,7,10,22,240};
        System.out.println("the array is");
        for(int s:arr)
        {
            System.out.println(s);
        }

        System.out.println("Multiply of 2 array is");

        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println(arr[i]+"is multiple of 2");
            }
            else
            {
                System.out.println(arr[i]+"is not multiple of 2");
            }
        }
    }
}
