import java.io.IOException;
import java.util.Scanner;

public class JavaTutorial {

    public static void main(String[] args) throws IOException {
        CheckingAccount ca = new CheckingAccount(101);
        InputChecker ic = new InputChecker();
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Input the desired amount\n");
            ic.inputChecker(input.next());

            System.out.println("\nWithdrawing $100...");
            ca.withdraw(100.00);
            System.out.println("\nWithdrawing $600...");
            ca.withdraw(600.00);
        } catch (UserException e) {
            System.out.println("Sorry, but you are short $" + e.getAmount());
            e.printStackTrace();
        } catch (RuntimeHandler runtimeHandler) {
            runtimeHandler.printStackTrace();
        }
    }
}