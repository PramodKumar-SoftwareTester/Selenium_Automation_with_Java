package java_brushup;

public class Class_Main_for_Inheritence {
    static void main(String[] args) {

        Class_A_for_inheritence a = new Class_B_for_inheritence();
        //a is the object of Class_B_for_inheritence() but Using the Properties of Class_A_for_inheritence
        //Class_B_for_inheritence inherited of Class_A_for_inheritence

        //the above one is similar to Webdriver driver = new Chromedriver();

        System.out.println(a.i);//so here i value is from Class_A_for_inheritence class = 20
        //i=20 - Class_A_for_inheritence
        //i=100 - Class_B_for_inheritence

    }
}
