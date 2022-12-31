public class ClassOne {

    public static void main(String[]args){

            System.out.println("for loop");

            for (int a = 3; a <= 5; a++) {
                System.out.println(a);
            }
            System.out.println("for loop in reverse order");

            for (int b = 9; b >= 2; b--) {
                System.out.println(b);
            }
            System.out.println("while loop");

            char c ='u';
            while (c=='u'){
                System.out.println(c);
                break;
            }

            System.out.println("while loop 2");

            int d = 7;
            while (d == 7) {
                System.out.println(d);
                d++;
            }
            System.out.println("while loop condition");

            int e = 11;
            while (e <= 33) {
                System.out.println(e);
                e++;
            }

            System.out.println("do while loop");

            int f =77;
            do{
                System.out.println(f);
                f++;
            }while(f<85);


    }
}
