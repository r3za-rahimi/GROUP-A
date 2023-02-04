import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList1 arrayList1 = new ArrayList1();
        LinkList1 linkList1 = new LinkList1();
        HashSet1 hashSet1 = new HashSet1();


        /**
         * نحوه اد کردن هم به این صورت انجام میشود
         *
         * نیاز به تلاش خیلی زیاد داری
         * فقط هم تمرین یک رو فرستادی !
         *که همین هم ناقص هست !
         */
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            arrayList1.add(i);
        }
        long t2 = System.currentTimeMillis();
        System.out.println("adding duration in ArrayList: "+(t2 - t1));


        linkList1.add();
        long t3 = System.currentTimeMillis();
        System.out.println("adding duration in LinkList: "+(t3 - t2));


        hashSet1.add();
        long t4=System.currentTimeMillis();
        System.out.println("adding duration in HashSet: "+(t4-t3));



//        System.out.println();
//        long t5=System.currentTimeMillis();
//
//        hashSet1.remove();
//        linkList1.remove();
//        arrayList1.remove();
//        //arrayList1.isContain(-1);
//        long t6=System.currentTimeMillis();
//        System.out.println(t6-t5);
//        long t1 = System.currentTimeMillis();
//        HashSet hashSet=new HashSet<>();
//        for (int i = 0; i < 500_000; i++) {
//            hashSet.add(i);
//        }
//        long t2=System.currentTimeMillis();
//        System.out.println(t2-t1);
//        ArrayList<Integer> arrayList=new ArrayList<>();
//        for (int i = 0; i < 500_000; i++) {
//            arrayList.add(i);
//        }
//        long t3 = System.currentTimeMillis();
//        System.out.println(t3-t2);
//        LinkedList linkedList=new LinkedList<>();
//        for (int i = 0; i < 500_000; i++) {
//            linkedList.add(i);
//        }
//        long t4 = System.currentTimeMillis();
//        System.out.println(t4-t3);


    }
    }

