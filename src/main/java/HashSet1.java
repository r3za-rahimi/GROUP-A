import java.util.HashSet;

public class HashSet1 {
    private HashSet<Integer> hashSet=new HashSet<>();

    public HashSet<Integer> getHashSet() {
        return hashSet;
    }

    public void setHashSet(HashSet<Integer> hashSet) {
        this.hashSet = hashSet;
    }

    /**
     * توضیحات این کلاس هم شبیه کلاس لیست
     */
    public void add(){
    for (int i = 0; i < 500_000; i++) {
        hashSet.add(i);
    }
}
public void remove(){
    for (int i = 499999; i > 0; i--) {
        hashSet.remove(i);
    }

}

    @Override
    public String toString() {
        return "HashSet1{" +
                "hashSet=" + hashSet +
                '}';
    }
}
