package java_brushup;

public class String_s {
    static void main(String[] args) {

        //Strings - 1st type creation - with literals
        //string is an object which is collection of sequence of charectors
        //common memory
        String s1="Pramod Kumar HL";
        String s2="Pramod Kumar HL";//same object refers because same literals

        //with new
        //heap memory
        String s3=new String("Pramod with selenium");
        String s4=new String("Pramod with selenium");
        //2 different object creates with same data

       // String[] splitstring=s1.split(" ");
       /* for( String a:splitstring)
        {
            System.out.println(a);
        }*/
        String[] spar=s1.split("Kumar");//remove the word/white spaces/any
        System.out.println(spar[0]);
        System.out.println(spar[1]);
        System.out.println(spar[1].trim());//trim the beside white space

        for(int i=0;i<s1.length();i++)
        {
            System.out.println(s1.charAt(i));
        }
    }
}
