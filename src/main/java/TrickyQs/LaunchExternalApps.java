package TrickyQs;

import java.io.IOException;

public class LaunchExternalApps {

    public static void main(String[] args) throws IOException, InterruptedException {

        // Open a note pad
        Runtime runTime = Runtime.getRuntime();
        Process pr = runTime.exec("notepad.exe c:\\desktop\\test1.text");
        Thread.sleep(4000);
        pr.destroy();

        // Open web page using Chrome
         String st [] = new String [] {"c:\\Program Files \\Google\\chrome\\Application\\chrome.exe","https://www.amazon.com"};
         runTime.exec(st);

         //Open media player
        String media [] = new String [] {"c:\\Program Files \\VideoLAN\\VLC\\vlc.exe","c:\\desktop\\new.mp4"};
        runTime.exec(media);
        Thread.sleep(4000);
        pr.destroy();

    }
}
