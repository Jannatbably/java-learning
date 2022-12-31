public class ClassFiveObject {


    public static void one(){
        int x=10;
        int y=5;
        int z=x+y;
        System.out.println(z);

    }

    public static int two(int a,int b, int c) {
          int d =a+b-c;
        return d;

    }


    public  int three(){
        int v=3;
        int w=6;
        int u=v+w;
        return u;
    }

    public int four(int a,int b){
        int c=a-b;
        return c;
    }
    public void five(){
        int s=3;
        int t=4;
        int q=s+t;
        System.out.println(q);
    }

    public static void main(String[] args) {
        one();

        System.out.println(two(30,15,11));
        ClassFiveObject cfo= new ClassFiveObject();
        System.out.println(cfo.three());
        System.out.println(cfo.four(20,9));
        cfo.five();
    }
















}
