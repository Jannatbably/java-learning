package StringConcept;

public class PracticOne {

    public static void main(String[] args) {
        String s ="Seleneieum";
        //1.String literal
        //2.By creating String object(String buffer,String builder)
        //s.length()
        System.out.println( s.length());
        //s.charAt(4);
        System.out.println(s.charAt(4));
        //s.indexOf('u');
        System.out.println(s.indexOf('e') );
        //s.lastIndexOf('e');
        System.out.println(s.lastIndexOf('e') );
        //s.indexOf('e', s.indexOf('e')+1);
        System.out.println( s.indexOf('e', s.indexOf('e')+1));
        //s.indexOf('e',s.indexOf('e')+3);
        System.out.println( s.indexOf('e', s.indexOf('e')+3));






    }



}
