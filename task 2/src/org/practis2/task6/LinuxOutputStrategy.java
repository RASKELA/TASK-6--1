package org.practis2.task6;

public class LinuxOutputStrategy implements OutputStrategy {
    @Override
    public void printReport(Document document) {
        System.out.println("Printing document on Linux: " + document.getDocumentName());
    }

    @Override
    public void sendReportViaMail(Document document) {
        System.out.println("Sending document via mail on Linux: " + document.getDocumentName());
    }

    @Override
    public void sendReportViaTelegram(Document document) {
        System.out.println("Sending document via Telegram on Linux: " + document.getDocumentName());
    }
}