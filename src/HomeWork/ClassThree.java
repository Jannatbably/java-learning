package HomeWork;

public class ClassThree {

    public void twelve() {
        String ss = "Chocolate";
        int l = ss.length();
        System.out.println(l);
        System.out.println(ss.substring(0, 3));//substring
        String s3 = ss.substring(0, 3);
        ss.concat(s3);
        //System.out.println(ss.concat(s3));
        System.out.println(s3 + s3 + s3);


    }
    public void thirteen() {
        String q = "cat";
        StringBuilder sb = new StringBuilder("cat");
        // sb.append('t');
        sb.append('t');
        // System.out.println(sb);
        System.out.println("t" + sb);

    }


    public boolean fourteenTwo(){
        int x= 35;
        if (x % 3 ==0) {
            return true;
        } else
            return false;
    }
    public void sixteen(){
        String d = "adelbc";

        StringBuffer st = new StringBuffer(d);
        st.deleteCharAt(1);
        st.deleteCharAt(1);
        st.deleteCharAt(1);
        System.out.println(st);

    }

    public static void main (String[]args){
        ClassThree ct= new ClassThree();
        ct.twelve();
        ct.thirteen();
        System.out.println (ct.fourteenTwo());
        ct.sixteen();


    }








}
