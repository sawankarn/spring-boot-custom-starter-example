package youtube.java.puzzle;

import org.springframework.stereotype.Component;

@Component
public class TestClass {

    @LogMethodExecutionTime
    public void run() throws InterruptedException {
        Thread.sleep(3000);
    }

}
