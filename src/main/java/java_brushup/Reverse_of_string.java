package java_brushup;

public class Reverse_of_string {
    static void main(String[] args) {

        String s="Pramod Kumar HL";
        String rev="";

        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        System.out.println("before Reverse - "+s);
        System.out.println("After Reverse - "+rev);
    }
}
