import java.io.*;

public class Q13 {
}

class FileDemo {
    public static void main(String[] args) {

        File f = new File("c:/Java/abc.txt");

        System.out.println("Exists = " + f.exists());
        System.out.println("Is Directory = " + f.isDirectory());
        System.out.println("Is File = " + f.isFile());
        System.out.println("Name = " + f.getName());
        System.out.println("Absolute Path = " + f.getAbsolutePath());
    }
}
