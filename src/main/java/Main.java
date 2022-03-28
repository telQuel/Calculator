import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] s1 = scanner.nextLine().split(" ");
            String[] arr = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

            if (Arrays.asList(arr).contains(s1[0])&&s1[1].matches("[\\+\\-*/]")&&Arrays.asList(arr).contains(s1[2])){
                RomanNumbers romanNumbers = new RomanNumbers();
                System.out.println(romanNumbers.calculate(s1));
            } else if ((Integer.parseInt(s1[0]) <= 10 && Integer.parseInt(s1[0]) >= 1)
                    &&s1[1].matches("[\\+\\-*/]")
                    &&(Integer.parseInt(s1[2]) <= 10 && Integer.parseInt(s1[2]) >= 1)) {
                ArabicNumbers arabicNumbers = new ArabicNumbers();
                System.out.println(arabicNumbers.calculate(s1));
            } else {
                throw new IllegalArgumentException();
            }
    }
}
