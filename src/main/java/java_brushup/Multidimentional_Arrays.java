package java_brushup;

public class Multidimentional_Arrays {
    static void main(String[] args) {

        //Multi dimentional Arrays

        int row = 2;
        int col = 3;

        //declared multi dimentional Array
        int arr[][] = new int[row][col];

        //assigning the values to array
        arr[0][0]=1; arr[0][1]=2; arr[0][2]=3;
        arr[1][0]=4; arr[1][1]=5; arr[1][2]=6;

        //print value at arr[1][0] -> second row first column
        //System.out.println(arr[1][0]);//4

        //Print all the elements in multi dimentional array
        for (int i=0; i<row; i++)
        {
            for (int j=0; j<col; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
