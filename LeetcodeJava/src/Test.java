import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 16:00 2019/1/6
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class Test {
    public static void main(String[] args) {
        try {
            URL url = new URL ("http://www.baidu.com");
            InputStream is = url.openStream ();
            InputStreamReader isr = new InputStreamReader (is);
            BufferedReader br = new BufferedReader ( isr );
            String data = br.readLine ();
            while(data != null) {
                System.out.println ( data );
                data = br.readLine ();
            }
            br.close ();
            isr.close ();
        } catch (IOException e) {
            e.printStackTrace ();
        }

    }
}
