
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );


       String dial = "22233344455566677778889999";
       char[] chars = new char[ dial.length() ];

       for ( int i = 0; i < dial.length(); i++ ) {
           chars[i] = dial.charAt(i);
       }


       String INPUT = br.readLine();
       char[] inputChars = new char[INPUT.length()];

        int result = 0;
       for ( int k = 0; k < INPUT.length(); k++ ){

           inputChars[k] = INPUT.charAt(k);
           char ch = chars[inputChars[k] - 'A'];

           result += Integer.parseInt(String.valueOf(ch)) + 1;
       }

        System.out.println(result);
       
    }
}