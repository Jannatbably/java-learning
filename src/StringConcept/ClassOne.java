package StringConcept;

public class ClassOne {
    public static void main(String[] args) {
        String s ="Selenieum";
        String s1="Selenenieum";
        //1.String literal
        //2.By creating String object(String buffer,String builder)
        //s.length()
        System.out.println( s.length());
        //s.charAt(4);
        System.out.println(s.charAt(4));
        //s.indexOf('e');
        System.out.println(s.indexOf('e') );
        //s.lastIndexOf('e');
        System.out.println(s.lastIndexOf('e') );
        //s.indexOf('e', s.indexOf('e')+1);
        System.out.println( s.indexOf('e', s.indexOf('e')+1));
        //String concat  (String concatenation)
       //** Sting literal is immutable/unchangeable
        String s3=s+s1;
        System.out.println(s3);

        s.concat("hi");
        System.out.println(s);

        String s4=s.concat("hi");
        System.out.println(s4);









    }










}
