package org.practis2.task6;

public class WindowsMonitoringStrategy implements TransportMonitoringStrategy {
    @Override
    public void monitorSpeed(Transport transport) {
        System.out.println("Monitoring speed on Windows for " + transport);
    }

    @Override
    public void monitorLocation(Transport transport) {
        System.out.println("Monitoring location on Windows for " + transport);
    }

    @Override
    public void monitorRoute(Transport transport) {
        System.out.println("Checking route on Windows for " + transport);
    }
}