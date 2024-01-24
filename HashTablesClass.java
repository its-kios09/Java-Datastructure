import java.util.Enumeration;
import java.util.Hashtable;

public class HashTablesClass {
//    HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
    public static void main(String[] args){
        Hashtable balance = new Hashtable();
        Enumeration names;
        String str;
        double bal;

        balance.put("Violet", new Double(2300.55));
        balance.put("Rose", new Double(2320.50));
        balance.put("Yellow", new Double(230.50));
        balance.put("Red", new Double(20.50));

        names = balance.keys();
        while (names.hasMoreElements()){
            str=(String) names.nextElement();
            System.out.println(str +":- " +balance.get(str));
        }
        System.out.println();
        bal = ((Double) balance.get("Violet")).doubleValue();
        balance.put("Violet", new Double(bal + 100000));
        System.out.println("Violet's new balance:- "+ balance.get("Violet"));


    }
}
