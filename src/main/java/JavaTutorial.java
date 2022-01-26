import java.io.*;

public class JavaTutorial {

    public static void main(String[] args) throws IOException {
        try (FileReader fr = new FileReader("E://file.txt")){
            char [] a = new char[50];
            fr.read(a);   // reads the content to the array
            for(char c : a)
                System.out.print(c);   // prints the characters one by one
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}