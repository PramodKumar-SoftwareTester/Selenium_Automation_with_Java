package java_brushup;

public class An_element_has_multiple_of_2 {
    static void main(String[] args) {

        // array has multiple of 2 in an y element -> Yes

        int[] arr = {1,3,5,7,4,6};
        for(int i=0; i< arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println("Yes array has an element of multiple of 2");
                break;// Exit the Loop
            }
            else
            {
                System.out.println("there are no elements which multiple of 2");
            }
        }

    }
}
