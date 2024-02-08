import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        System.out.print("Enter the user name: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, " + input.nextLine());
    }
}
