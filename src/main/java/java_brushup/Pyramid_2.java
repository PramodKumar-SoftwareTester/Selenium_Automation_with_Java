package java_brushup;

public class Pyramid_2 {
    static void main(String[] args) {

        int n = 4;
        int k=1;

        for (int i=0;i<n;i++)
        {
            for(int j=1;j<=i+1;j++)
            {
                System.out.print(k+"  ");
                k++;
            }
            System.out.println();
        }
    }
}
