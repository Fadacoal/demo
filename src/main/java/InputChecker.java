public class InputChecker {

    public void inputChecker(String a) throws RuntimeHandler {
        String regex = "\\d+";
        CheckingAccount ca = new CheckingAccount(101);
        if (a.equals(regex)) {
            System.out.println("Depositing " + a + "...");
            ca.deposit(Double.valueOf(a));
        } else {
            throw new RuntimeHandler(a);
        }
    }
}
