public class ClassMethodTwo {
    public static void main(String[] args) {
      day();
      System.out.println(night(4,8));
      ClassMethodTwo cmt =new ClassMethodTwo();
      cmt.boy(30,15);
      System.out.println(cmt.boy(30,15));



    }

    public static void day(){
        int x=10;
        int y=20;
        int z=y-x;

        System.out.println(z);

    }
    public static int night(int e,int f){
        int g=e+f;
        return g;
    }
    public int boy(int m,int n){
        int o=m-n;
        return o;
    }




}
