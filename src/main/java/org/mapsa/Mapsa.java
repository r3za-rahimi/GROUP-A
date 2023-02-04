package org.mapsa;

import java.util.*;

public class Mapsa {
    public static String timeArrayList(){
        List<Long> arrayList = new ArrayList<>() ;
        long l1 = System.currentTimeMillis() ;
        for (long i = 0; i < 50000; i++) {
            arrayList.add(i) ;
        }
        long l2 = System.currentTimeMillis() ;
        for (long i = 0; i < 50000; i++) {
            arrayList.remove(i) ;
        }
        long l3 = System.currentTimeMillis() ;
        for (long i = 0; i < 50000; i++) {
            arrayList.contains(i);
        }
        long l4 = System.currentTimeMillis() ;
        return "ArrayList add time = "+(l2 - l1)+"\n"+
                "ArrayList remove time = "+(l3-l2)+"\n"+
                "ArrayList contains time = "+(l4-l3)+"\n"+
                "--------------------------" ;
    }
    public static String timeLinkedList(){
        List<Long> linkedList = new LinkedList<>() ;
        long l1 = System.currentTimeMillis() ;
        for (long i = 0; i < 50000; i++) {
            linkedList.add(i) ;
        }
        long l2 = System.currentTimeMillis() ;
        for (long i = 0; i < 50000; i++) {
            linkedList.remove(i) ;
        }
        long l3 = System.currentTimeMillis() ;
        for (long i = 0; i < 50000; i++) {
            linkedList.contains(i);
        }
        long l4 = System.currentTimeMillis() ;
        return "LinkedList add time = "+(l2 - l1)+"\n"+
                "LinkedList remove time = "+(l3-l2)+"\n"+
                "LinkedList contains time = "+(l4-l3)+"\n"+
                "--------------------------" ;
    }
    public static String timeHashSet(){
        HashSet hashSet = new HashSet<>() ;
        long l1 = System.currentTimeMillis() ;
        for (long i = 0; i < 50000; i++) {
            hashSet.add(i) ;
        }
        long l2 = System.currentTimeMillis() ;
        for (long i = 0; i < 50000; i++) {
            hashSet.remove(i) ;
        }
        long l3 = System.currentTimeMillis() ;
        for (long i = 0; i < 50000; i++) {
            hashSet.contains(i);
        }
        long l4 = System.currentTimeMillis() ;
        return "HashSet add time = "+(l2 - l1)+"\n"+
                "HashSet remove time = "+(l3-l2)+"\n"+
                "HashSet contains time = "+(l4-l3)+"\n"+
                "--------------------------" ;
    }
    public static boolean unique(String string){
        Hashtable<Character,Integer> hashtable = new Hashtable<>() ;
        int ascii = 0 ;
        for (int i = 0; i < string.length(); i++) {
            if(!hashtable.containsKey(string.charAt(i))){
                ascii = string.charAt(i) ;
                hashtable.put(string.charAt(i),ascii) ;
            }else return false ;
        }
        return true ;
    }
}
