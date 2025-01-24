package org.practis2.task6;

public class WindowsOutputStrategy implements OutputStrategy {
    @Override
    public void printReport(Document document) {
        System.out.println("Printing document on Windows: " + document.getDocumentName());
    }

    @Override
    public void sendReportViaMail(Document document) {
        System.out.println("Sending document via mail on Windows: " + document.getDocumentName());
    }

    @Override
    public void sendReportViaTelegram(Document document) {
        System.out.println("Sending document via Telegram on Windows: " + document.getDocumentName());
    }
}