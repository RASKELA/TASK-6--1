package org.practis2.task6;

public class Transport {
    private String id;
    private String type; // Тип транспорта (автобус, трамвай, троллейбус)
    private String route; // Номер маршрута

    public Transport(String id, String type, String route) {
        this.id = id;
        this.type = type;
        this.route = route;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getRoute() {
        return route;
    }

    @Override
    public String toString() {
        return "org.practis2.task6.Transport [ID=" + id + ", Type=" + type + ", Route=" + route + "]";
    }
}