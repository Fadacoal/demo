class Superclass {
    int age;
    String s;

    Superclass(int age) {
        this.age = age;
    }

    Superclass(String s) {
        this.s = s;
    }

    public void getAge() {
        System.out.println("The value of the variable named age in super class is: " + age);
    }

    public void getString() {
        System.out.println("The value of String is " + s);
    }
}

public class JavaTutorial extends Superclass {
    JavaTutorial(int age) {
        super(age);
    }

    JavaTutorial(String s) {
        super(s);
    }

    public static void main(String args[]) {
        JavaTutorial s = new JavaTutorial(24);
        s.getAge();
        s = new JavaTutorial("Test");
        s.getString();
    }
}