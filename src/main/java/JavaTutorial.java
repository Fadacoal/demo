
public class JavaTutorial {

    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int sum;
        double result;
        String[] arrayOfChoices = {"addition", "exponent"};

        Operations object = new Operations();

        for (String i : arrayOfChoices) {
            if (i == "addition") {
                sum = object.Addition(x, y);
                System.out.println(sum);
            } else if (i == "exponent") {
                result = object.Exponent(x, y);
                System.out.println(result);
            } else {
                System.out.println("Choice is not been made");
            }
        }
    }
}
