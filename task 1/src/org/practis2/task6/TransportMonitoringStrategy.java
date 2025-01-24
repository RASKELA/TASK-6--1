package org.practis2.task6;

public interface TransportMonitoringStrategy {
    void monitorSpeed(Transport transport); // Мониторинг скорости
    void monitorLocation(Transport transport); // Мониторинг местоположения
    void monitorRoute(Transport transport); // Проверка маршрута
}