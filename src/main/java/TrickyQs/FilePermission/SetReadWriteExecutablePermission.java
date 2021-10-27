package TrickyQs.FilePermission;

import java.io.File;

public class SetReadWriteExecutablePermission {

    public static void main(String[] args) {

        File file = new File("c:\\desktop\\resume.java");

        file.setExecutable(true);
        file.setReadable(false);
        file.setWritable(true);
    }
}
