public class JavaTutorial {

    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int sum;
        double result;
        String[] arrayOfChoices = {"addition", "exponent"};

        Operations object = new Operations();
        object.setSum();
        for (String i : arrayOfChoices) {
            if (i == "addition") {
                sum = object.addition(x, y);
                System.out.println(sum);
            } else if (i == "exponent") {
                result = object.exponent(x, y);
                System.out.println(result);
            } else {
                System.out.println("Choice is not been made");
            }
        }
    }
}
