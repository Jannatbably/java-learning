public class LoopingConcept {

    public static void main(String[] args){

        for(int y =0;y<=15;y++) {
            System.out.println(y);
        }
        System.out.println("loop in reverse order");


        for(int z=40;z>=30;z--){
            System.out.println(z);
        }
        System.out.println("*while loop**");

        int a =100;      //while always true//
        while( a==100){
            System.out.println(a);
            break;
        }
        System.out.println("while loop 2");
        int b =32;
        while(b==32){
            System.out.println(b);
            b++;
        }
        System.out.println("while loop condition");
        int c=0;
        while(c<6){
            System.out.println(c);
            c++;
        }
        System.out.println("do while loop");

        int d=7;
        do{
            System.out.println(d);
            d++;
        }while(d<15);
        System.out.println("do while loop 2");

        int e=55;
        do{
            System.out.println(e);
            e++;

        }while(e<=60);

    }

}
