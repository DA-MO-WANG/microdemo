package core_exp;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SocketTest {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("time-a.nist.gov",13);
            Scanner in = new Scanner(s.getInputStream(),"utf-8");
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
