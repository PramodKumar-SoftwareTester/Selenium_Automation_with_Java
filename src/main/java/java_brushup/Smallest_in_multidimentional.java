package java_brushup;

public class Smallest_in_multidimentional {
    static void main(String[] args) {

        int arr[][]={{5,500,300},{300,2,100},{3,7,10}};

        Smallest_in_multidimentional sm = new Smallest_in_multidimentional();//calling the object

        int minimum = sm.smallest(arr);//assigning the returned value to minimum
        System.out.println("smallest number in the matrix is: " + minimum);

    }

    public int smallest (int arr[][])//using the method/function like utility
    {

        int min=arr[0][0];// or min=0;

        for (int i=0; i< arr.length; i++)
        {
            for (int j=0; j< arr.length; j++)
            {
                if(arr[i][j]<min)
                {
                        min=arr[i][j];
                }
            }
        }
        return min;
    }
}
