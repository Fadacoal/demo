public class JavaTutorial implements Animal {

    public void eat() {
        System.out.println("Mammal eats");
    }

    public void travel() {
        System.out.println("Mammal travels");
    }

    public int noOfLegs() {
        return 0;
    }

    public static void main(String[] args) {
        JavaTutorial m = new JavaTutorial();
        m.eat();
        m.travel();
    }
}