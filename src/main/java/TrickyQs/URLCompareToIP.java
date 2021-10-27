package TrickyQs;

import java.net.MalformedURLException;
import java.net.URL;

public class URLCompareToIP {
    // What will be the output when you compare site UR with its IP address?

    public static void main(String[] args) throws MalformedURLException {

        System.out.println(new URL("https://app.hubpost.com/").equals(new URL("https://104.19.155.83")));

    }
}
