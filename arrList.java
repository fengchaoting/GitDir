import java.util.ArrayList;

public class arrList {
    public static void main(String[] args) {
        ArrayList<String> arrL = new ArrayList<>();
        System.out.println("arrL = "+ arrL);
        arrL.add("LLL");
        System.out.println("arrL = " + arrL);
        arrL.add("LLL");
        System.out.println("arrL = " + arrL);
        arrL.add(2,"rr");
        System.out.println("arrL = " + arrL);
        arrL.add("LLL");
        System.out.println("arrL = " + arrL);
        arrL.remove(2);
        System.out.println("arrL = " + arrL);
        boolean aaa=(arrL.size()==3) ;
        System.out.println(aaa);
        System.out.println("aa = " + arrL.get(1));
        //System.out.println("arrL = " + arrL[1]);
    }
}
