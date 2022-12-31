public class ClassMethod {

    public static void main(String[] args) {
        sum();
        sum1();
        System.out.println("this is the value "+ sum1());
        sum3();
        System.out.println("thid is the value of "+sum3());
       //one(3,4);
        System.out. println( "this is the value of one "+one(3,4));
        //two(5,3,2);
        System.out.println("this is the value of two "+two(5,3,2));
    }

    public static void sum() {
        int a=3;
        int b=4;
        int c=a+b;
        System.out.println(c);

    }

    public static int sum1() {

        int e =7;
        int f=5;
        int g=e+f;
        return g;


    }

    public static  boolean sum3() {
        int x =99;
        int y =100;

        if(x==y){
         return true;

        }else{
            return false;
        }


    }

    public static int one(int x,int y) {

        int z=x+y;
        return z;


    }

    public static int two(int a,int b,int c) {

        int d=a+b-c;
        return d;
    }
















}
