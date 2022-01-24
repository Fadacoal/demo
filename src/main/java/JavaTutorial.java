import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaTutorial {

    public static void main(String[] args) {
        String line = "This order was placed for A123 OK?";
        String pattern = "(.*)(\\d)(.*)";

        RegEx regex = new RegEx();
        Pattern r = Pattern.compile(pattern);


        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println(m.start());
            System.out.println(m.start(3));
            System.out.println(m.end());
            System.out.println(m.end(1));
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
            System.out.println("Found value: " + m.group(3));
        } else {
            System.out.println("NO MATCH");
        }
    }
}
