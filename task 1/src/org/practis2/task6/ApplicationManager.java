package org.practis2.task6;

public class ApplicationManager {
    private TransportMonitor transportMonitor;

    public ApplicationManager() {
        // Создаем пользователя
        User user = new User("Alice", "Johnson");
        System.out.println("org.practis2.task6.User: " + user);

        // Создаем транспорт
        Transport transport = new Transport("12345", "Bus", "10A");
        System.out.println("org.practis2.task6.Transport initialized: " + transport);

        // Создаем монитор
        transportMonitor = new TransportMonitor(transport);

        // Устанавливаем стратегию в зависимости от платформы
        String platform = System.getProperty("os.name").toLowerCase();
        if (platform.contains("win")) {
            transportMonitor.setMonitoringStrategy(new WindowsMonitoringStrategy());
        } else if (platform.contains("linux")) {
            transportMonitor.setMonitoringStrategy(new LinuxMonitoringStrategy());
        } else if (platform.contains("mac")) {
            transportMonitor.setMonitoringStrategy(new MacMonitoringStrategy());
        } else {
            transportMonitor.setMonitoringStrategy(new AndroidMonitoringStrategy());
        }
    }

    public static void main(String[] args) {
        ApplicationManager manager = new ApplicationManager();

        // Выполняем мониторинг
        manager.transportMonitor.monitorSpeed();
        manager.transportMonitor.monitorLocation();
        manager.transportMonitor.monitorRoute();
    }
}