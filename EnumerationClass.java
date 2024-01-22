import java.util.Enumeration;
import java.util.Vector;

//An enumeration (enum for short) in Java is a special data type which contains a set of predefined constants.
public class EnumerationClass {
    public static void main(String[] args) {
        Enumeration<String> days;
        Vector<String> dayNames = new Vector<>();
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");

        days = dayNames.elements();
        while (days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }
    }
}
