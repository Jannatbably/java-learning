package ArrayMainConcept;

import java.util.ArrayList;
import java.util.LinkedList;

public class ClassOne {
    public static void main(String[] args) {
        //Arrays=1.Static 2.Dynamic
        ///Ststic(1D,2D,3D)
        int a[] = new int[4];
        a[0] = 4;
        a[1] = 6;
        a[2] = 7;
        a[3] = 10;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        //Dynamic arrays is called Arraylist,Linklist
        /// Arraylist
        ArrayList al = new ArrayList();
        //arraylist add method
        al.add("mobinah");
        al.add(34);
        al.add(true);
        al.add(5.9);


        for (int j = 0; j < al.size(); j++) {
            System.out.println(al);
        }
        //arraylist get method
        al.get(1);
        System.out.println(al.get(1));

        //LinkedList
        LinkedList lk = new LinkedList();

        lk.add("Ayman");
        lk.add(28);
        lk.add(false);
        lk.add(4.7);

        for (int j = 0; j < lk.size(); j++) {
            System.out.println(lk);

            //LinkedList get method
            lk.get(1);
            System.out.println(lk.get(1));


        }


    }

}
