import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type what ever you want: ");
        String newInput = input.nextLine();
        System.out.println("Is it a number: " + StringUtils.isNumeric(newInput));
        System.out.println("Swap that case: " + StringUtils.swapCase(newInput));
        System.out.println("Reversed: " + StringUtils.reverse(newInput));
    }
}
