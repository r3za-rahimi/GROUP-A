import java.util.ArrayList;

public class ArrayList1 {

    private ArrayList<Integer> arrayList = new ArrayList<Integer>();

    /**
     *
     *
     * هر متد وظیفه انجام فقط یک کار رو داره
     * اگر متد اد نوشتی فقط باید اد انجام بده
     *  پر کردن  ارایه نباید به این صورت اتفاق بیوفته
     *  دونه دونه باید المنت ها ارسال بشه
     * و اینکه خروجی متد اد معمولا به صورت boolean هستش
     * یعنی مشخص میشه اد شد یا خیر
     *  متد صحیح رو مینوسیم برات
     */
//    public ArrayList add() {
//        for (int i = 0; i < 500_000; i++) {
//            arrayList.add(i);
//        }
//        return arrayList;
//    }

    /**
     * اصلاحی
     */
    public boolean add(int number) {

        return arrayList.add(number);

    }

    /**
     * در حلقه فور که نوشتی باید طول لیست رو مینوشتی
     * نه این که هارد کد عدد رو ذکر کنی
     * و اینکه خود لیست متد کانتین داره که این کار رو انجام میده لزومی به حلقه نوشتن نبود در کل
     */
    public boolean isContain(int context) {
//            for (int i = 0; i < 500_000; i++) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.contains(context)) {

                return true;
            }
        }

        return false;
    }

    /**
     *
     * باید از arrayList.size()
     * استفاده میکردی
     */
    public void remove() {
        for (int i = 499999; i > 0; i--) {
            arrayList.remove(i);
        }

    }

    @Override
    public String toString() {
        return "ArrayList1{" +
                "arrayList=" + arrayList +
                '}';
    }
}
