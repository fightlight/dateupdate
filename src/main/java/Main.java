public class Main {
    public static void main(String[] args) {
        UpdateController controller = new UpdateController();

        for (int i = 0; i < 100; i++) {
            controller.saveRecord(i);
            controller.updateSent(i);
            controller.updateRead(i);
        }

        System.out.println("##### FINISHED SUBMIT #####");

        controller.destroy();
    }
}
