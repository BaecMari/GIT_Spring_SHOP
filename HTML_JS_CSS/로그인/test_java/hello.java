import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class hello {
    public static void main(String[] args) throws Exception{
        System.out.println("hello");

        InputStream in = System.in;        
        //int a;
        //a = in.read();

        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        String a = br.readLine();

        System.out.println(a);
    }
}