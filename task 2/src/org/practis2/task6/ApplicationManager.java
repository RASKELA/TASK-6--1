package org.practis2.task6;

public class ApplicationManager {
    private OutputController ioController;

    public ApplicationManager() {
        User user = new User("John", "Doe");
        Document document = new Document("Report", "This is a test report.", user);

        ioController = new OutputController(document);

        String platform = System.getProperty("os.name").toLowerCase();
        if (platform.contains("win")) {
            ioController.setOutputStrategy(new WindowsOutputStrategy());
        } else if (platform.contains("nix") || platform.contains("nux")) {
            ioController.setOutputStrategy(new LinuxOutputStrategy());
        } else if (platform.contains("mac")) {
            ioController.setOutputStrategy(new MacOutputStrategy());
        } else {
            ioController.setOutputStrategy(new AndroidOutputStrategy());
        }
    }

    public void run() {
        ioController.printReport();
        ioController.sendReportViaMail();
        ioController.sendReportViaTelegram();
    }

    public static void main(String[] args) {
        ApplicationManager manager = new ApplicationManager();
        manager.run();
    }
}