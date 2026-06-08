package java_brushup;

public class MethodsDemo1 {
    static void main(String[] args) {

        //we should not create method inside Main Method, we only call methods here
        //we have to create Object
        MethodsDemo1 d=new MethodsDemo1();
        d.getdata();

        String name=d.getdata2();
        System.out.println(name);

        MethodDemo2 d2=new MethodDemo2();
        d2.getuserdata();// from another class - MethodDemo2

        juststat();//due to using static, this class access the method directly without using object

    }

    public void getdata()//method
    {
        System.out.println("Hello");
    }

    public String getdata2()
    {
        return  "Selenium with java";
    }

    public static void juststat()
    {
        System.out.println("without Object created");
    }
}
