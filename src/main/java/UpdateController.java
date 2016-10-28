import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UpdateController {

    private ExecutorService executor = Executors.newFixedThreadPool(10);

    public void saveRecord(long id) {
        executor.submit(new Task("save", id));
    }

    public void updateSent(long id) {
        executor.submit(new Task("sent", id));
    }

    public void updateRead(long id) {
        executor.submit(new Task("read", id));
    }

    public void destroy() {
        executor.shutdown();
    }
}
