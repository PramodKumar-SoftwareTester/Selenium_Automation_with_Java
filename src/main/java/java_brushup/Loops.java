package java_brushup;

public class Loops {
    static void main(String[] args) {

        //while loop
        int i = 1;//initialisation
        while(i<=10)//condition
        {
            System.out.println(i);
            i++;//Operation
        }

        //do while
        //it will execute the block once, then after check the condition
        do {
            System.out.println(i);
            i++;//operation
        }while(i<=10);//condition

        for(int j=0;j<=10;j++)//initialization;condition;operation
        {
            System.out.print(j+" ");//statement
        }
    }
}
