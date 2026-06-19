package java_brushup;

public class RealTime_Function_overload_APPS {

    public void getpayment(int Indemnity)
    {
        System.out.println(Indemnity);
    }

    public void getpayment(float AandO)
    {
        System.out.println(AandO);
    }

    public void getpayment(double Defense)
    {
        System.out.println(Defense);
    }

    static void main(String[] args) {

        RealTime_Function_overload_APPS ro = new RealTime_Function_overload_APPS();

        ro.getpayment(1);
        ro.getpayment(2.0);
        ro.getpayment(3.000000);
    }
}
