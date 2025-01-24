package org.practis2.task6;

public class MacOutputStrategy implements OutputStrategy {
    @Override
    public void printReport(Document document) {
        System.out.println("Printing document on macOS: " + document.getDocumentName());
    }

    @Override
    public void sendReportViaMail(Document document) {
        System.out.println("Sending document via mail on macOS: " + document.getDocumentName());
    }

    @Override
    public void sendReportViaTelegram(Document document) {
        System.out.println("Sending document via Telegram on macOS: " + document.getDocumentName());
    }
}