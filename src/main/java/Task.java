public class Task implements Runnable{

    private String op;
    private long id;

    public Task(String op, long id) {
        this.op = op;
        this.id = id;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            //
        }

        switch (op) {
            case "read":
                System.out.println("update read id: " + id + " - " + System.currentTimeMillis());
                break;

            case "sent":
                System.out.println("update sent id: " + id + " - " + System.currentTimeMillis());
                break;

            case "save":
                System.out.println("save id: " + id + " - " + System.currentTimeMillis());
                break;
        }
    }
}
