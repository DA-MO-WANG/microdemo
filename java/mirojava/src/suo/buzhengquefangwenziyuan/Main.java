package suo.buzhengquefangwenziyuan;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i= 0; i < 10000; i++) {
            exec.execute(new Task(new User(),i));
        }
        exec.shutdown();
    }
}
