import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws Exception {
        beforeJava7();
        withJava7();
        withCustomersJava7();
    }
    public static void beforeJava7() throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:/Users/jaspr_000/Desktop/SpringUdemy/Java8_Lambdasandstreams/abc.txt"));
            String currLine;
            while ((currLine = br.readLine()) != null) {
                System.out.println(currLine);
            }
        }finally {
            br.close();
        }
    }

    /* whatever you are declaring inside try block is final and can't be changed
    * The resources wille closed automatically
    * We don't need finally block */
    public static void withJava7() throws FileNotFoundException, IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("C:/Users/jaspr_000/Desktop/SpringUdemy/Java8_Lambdasandstreams/abc.txt"));){
            String currLine;
            while((currLine=br.readLine()) != null){
                System.out.println(currLine);
            }
        }
    }
    public static void withCustomersJava7() throws Exception {
        try(CustomResource cr = new CustomResource();){
            cr.readData();
        }
    }
}

