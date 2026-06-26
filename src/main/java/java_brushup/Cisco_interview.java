package java_brushup;

public class Cisco_interview {

    static void main(String[] args) {

        //step 1 - find the minimum value in the matrix
        //step 2 - find the column of the minimum value
        //step 3 - find the maximum number in that column

        int arr[][]={{2,300,400},{30,200,100},{3,200,2500}};
        int min=arr[0][0];
        int minicol =0;
        int max=0;

        for(int i=0; i< arr.length;i++)
        {
            for (int j=0; j<arr.length; j++)
            {
                if(arr[i][j]<min)
                {
                    min=arr[i][j];//step 1 - find the minimum
                    minicol=j;//step 2 - find the column of the min value
                }
            }
        }

        int k=0;
        while (k<arr.length)
        {
            if(arr[k][minicol]>max)
            {
                max=arr[k][minicol];//step 3 - find the max value in that column of mini value of matrix
            }
            k++;
        }
        System.out.println("the maximum value of the column of min value of matrix is: "+max);
    }
}
