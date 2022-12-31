package StringConcept;

public class ClassTwo {
    public static void main(String[] args) {
        //By creating String Object=1.String Buffer 2.String Builder

        StringBuffer sbf =new StringBuffer("Good");   //Synchronized(threat safe)
        sbf.deleteCharAt(1);//{if u want to delect any character from string value use delectchaAt mod}
        System.out.println(sbf);

        StringBuilder sb=new StringBuilder("Java");   //Synchronized(not threat safe)
        sb.append('s');                               //{if u want to add any character with string value use append mod}
        System.out.println(sb);

        //String Comparison
        String p="Java";
        String q="Learning";
        String r="Java";
        String s="java";
        p.equals(q);
        System.out.println(p.equals(q));//this equal method for referance value
                                         // p==q;**// this equal method for referance variable
        System.out.println(p==q);
        p.equals(r);
        System.out.println(p.equals(r));

        p.equalsIgnoreCase(q);
        System.out.println( p.equalsIgnoreCase(q));
        p.equalsIgnoreCase(r);
        System.out.println( p.equalsIgnoreCase(r));
        p.equalsIgnoreCase(s);
        System.out.println( p.equalsIgnoreCase(s));

        //trim    {trim is only used to remove before and after space}
        String g="  Good  ";
        System.out.println(g);
        g.trim();
        System.out.println(g);
        String b=g.trim();
        System.out.println(b);

        //Split  { Split is used to remove middle space/any sing/any character.For using of split, string are divided,
        //             they are becoming many array.}
        String f="Navi:gate";
        System.out.println(f);
        String f1[]= f.split(":");      //{To print this array,we should forloop }
        for(int i=0;i< f1.length;i++){
            System.out.println(f1[i]);
        }
        String e="My name is jannat";
        System.out.println(e);
        String e1[]=e.split(" ");
        for(int i=0;i<e1.length;i++){
            System.out.println(e1[i]);
        }
        String a="United States of America";
        String a1[]=a.split("of");
        for(int j=0;j<a1.length;j++){
            System.out.println(a1[j]);
        }
        //String replace
        String c="Rod";
       //c.replace('o','e');
       System.out.println(c.replace('o','e'));

       //String substring
        String d="Java Learning";
        d.length();
        System.out.println(d.length());
        d.substring(3);
        System.out.println(d.substring(3));
        d.substring(3,10);
        System.out.println(d.substring(3,10));
        //String starts with
        String h="Book Learning";
        h.startsWith("Book");
        System.out.println( h.startsWith("Book"));
        //String ends with
        String i="Md.Abdul Motin";
        i.endsWith("motin");
        System.out.println(i.endsWith("motin"));
        i.endsWith("Motin");
        System.out.println(i.endsWith("Motin"));












    }






}
