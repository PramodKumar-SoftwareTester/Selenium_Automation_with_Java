package java_brushup;

public class Function_Overriding_child extends Funtion_Overriding_Parent {

    public void engine()
    {
        System.out.println("Engine developed");
    }

    //Over Riding the Parent Method in Child Class
    //Function/Method Overloading
    public void audio_system()
    {
        System.out.println("this is CHILD audio system");
    }

    static void main(String[] args) {

        Function_Overriding_child fo = new Function_Overriding_child();

        fo.engine();
        fo.breaks();

        //Overriden method/Function
        fo.audio_system();//This is CHILD audio system
    }
}
