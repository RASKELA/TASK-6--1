package org.practis2.task6;

public class TransportMonitor {
    private Transport transport;
    private TransportMonitoringStrategy strategy;

    public TransportMonitor(Transport transport) {
        this.transport = transport;
    }

    public void setMonitoringStrategy(TransportMonitoringStrategy strategy) {
        this.strategy = strategy;
    }

    public void monitorSpeed() {
        if (strategy != null) {
            strategy.monitorSpeed(transport);
        }
    }

    public void monitorLocation() {
        if (strategy != null) {
            strategy.monitorLocation(transport);
        }
    }

    public void monitorRoute() {
        if (strategy != null) {
            strategy.monitorRoute(transport);
        }
    }
}