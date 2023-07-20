import java.util.Locale;
import java.util.Scanner;

public class upper {
    public static void main(String[] args) {
        System.out.println("Enter The String :");
        Scanner scanner=new Scanner(System.in);
        String sa=scanner.nextLine();

        String k=sa.toLowerCase();
        String l=sa.toUpperCase();
        System.out.println("Lower Case :");
        System.out.println(k);
        System.out.println("Upper Case :");
        System.out.println(l);
    }
}
