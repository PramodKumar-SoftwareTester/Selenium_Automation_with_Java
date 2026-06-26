package java_brushup;

public class Largest_number {
    static void main(String[] args) {

        int arr1[]={2,3,300,4000,5,500,6000,2,2000};
        int arr2[][]={{200,300,4000},{300,5000,2}};

        Largest_number lar = new Largest_number();

        System.out.println("Largest number in Array is: "+ lar.largestinarray(arr1));
        System.out.println("Largest number in Matrix is: "+ lar.largestinarray2(arr2));

    }

    public int largestinarray(int arr1[])
    {
        int max1=arr1[0];
        for(int i =0; i<arr1.length; i++)
        {
            if(arr1[i]>max1)
            {
                max1=arr1[i];
            }
        }
        return max1;
    }

    public int largestinarray2(int arr2[][])
    {
        int max2=arr2[0][0];
        for(int i =0; i<arr2.length; i++)
        {
            for (int j=1; j<=arr2.length;j++)
            {
                if(arr2[i][j]>max2)
                {
                    max2=arr2[i][j];
                }
            }
        }
        return max2;
    }
}
