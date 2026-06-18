package java_brushup;

public class Child_Arab_Emirates extends Parent_AirCraft {//extends - specifications from parent to child classes
    static void main(String[] args) {

        Child_Arab_Emirates c = new Child_Arab_Emirates();//Creating the Object for the class
        c.Engine_Specifications();//object is calling the Methods
        c.Safety_Guidelines();
        c.Aircraft_Color();
        c.Aircraft_Type();

    }

    @Override
    public void Aircraft_Color() {//developed the abstracted method
        System.out.println("Emirates Aircraft color is Red with White");
    }

    @Override
    public void Aircraft_Type() {//developed the abstracted method
        System.out.println("type of this aircraft is Luxurious");
    }
}
