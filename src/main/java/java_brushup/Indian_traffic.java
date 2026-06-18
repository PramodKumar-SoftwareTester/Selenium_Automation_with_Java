package java_brushup;

public class Indian_traffic implements Central_Traffic,Continental_Traffic {
    static void main(String[] args) {

        Central_Traffic C = new Indian_traffic();//creating object C for the Class Indian Traffic class
        //to work on Central Traffic Methods
        //Interface methods
        C.GreenGo();
        C.RedStop();
        C.YellowStart();

        Indian_traffic i = new Indian_traffic();
        i.walk();//own metho of the class

        Continental_Traffic co = new Indian_traffic();
        co.SchoolSymbol();
    }
    @Override
    public void GreenGo() {
        System.out.println("Go");
    }

    @Override
    public void YellowStart() {
        System.out.println("Start");

    }

    @Override
    public void RedStop() {
        System.out.println("Stop");

    }

    public void walk()//apart from interface methods developing body we also can develop own Methods for the class
    {
        System.out.println("Simply Walk");
    }

    @Override
    public void SchoolSymbol() {
        System.out.println("Slowly drive");
    }
}
