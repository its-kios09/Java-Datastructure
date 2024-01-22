enum EnumColors {
    Red, Blue, Green
}
//You'll usually use an enum when dealing with values that aren't required to change, like days of the week, seasons of the year, colors, and so on.
public class EnumColor {
 public static void main(String[] args) {
        EnumColors red = EnumColors.Red;
        System.out.println("The Color is:- " + red);

    }
}