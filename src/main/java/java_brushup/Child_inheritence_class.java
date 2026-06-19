package java_brushup;

public class Child_inheritence_class extends Parent_Inheritence_Class {//extends key word used to inherit from Parent to child

    public void engine()
    {
        System.out.println("engine code is developed");
    }

    public void colour()
    {
        System.out.println(col);//this col variable is used from Parent class to child class here
    }

    static void main(String[] args) {

        Child_inheritence_class cd = new Child_inheritence_class();//Object for the class

        //access the methods from the Parent Inherit class
        cd.gear();
        cd.breaks();
        //and can access the method of own class
        cd.colour();
        cd.engine();

    }
}
