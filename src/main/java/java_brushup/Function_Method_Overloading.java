package java_brushup;

public class Function_Method_Overloading {

    public void getdata(int a)
    {
        System.out.println(a);
    }
//Argument count is different
    public void getdata(int a, int b)
    {
        System.out.println(a+b);
    }
//Argument data Type is different
    public void getdata(String a)
    {
        System.out.println(a);
    }

    static void main(String[] args) {

        Function_Method_Overloading fo = new Function_Method_Overloading();

        fo.getdata(5);//5
        fo.getdata("Pramod");//Pramod
        fo.getdata(2,3);//2+3=5
    }
}
