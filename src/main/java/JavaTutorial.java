import java.io.*;

public class JavaTutorial {

    public static void main(String[] args) throws IOException {
        createDirectory();

        try {
            byte bWrite [] = {11,21,3,40,5};
            OutputStream os = new FileOutputStream("test.txt");
            for(int x = 0; x < bWrite.length ; x++) {
                os.write( bWrite[x] );   // writes the bytes
            }
            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for(int i = 0; i < size; i++) {
                System.out.print((byte)is.read() + "  "); // char conversion was not an alphanumeric, it output the byte
            }
            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }

    public static void createDirectory(){
        String dirname = "/Users/bx42bn/Downloads/demo/src/main/java/newDirectory";
        File d = new File(dirname);

        // Create directory now.
        d.mkdirs();
    }
}

