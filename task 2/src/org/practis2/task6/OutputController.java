package org.practis2.task6;

public class OutputController {
    private Document document;
    private OutputStrategy outputStrategy;

    public OutputController(Document document) {
        this.document = document;
    }

    public void setOutputStrategy(OutputStrategy outputStrategy) {
        this.outputStrategy = outputStrategy;
    }

    public void printReport() {
        if (outputStrategy != null) {
            outputStrategy.printReport(document);
        }
    }

    public void sendReportViaMail() {
        if (outputStrategy != null) {
            outputStrategy.sendReportViaMail(document);
        }
    }

    public void sendReportViaTelegram() {
        if (outputStrategy != null) {
            outputStrategy.sendReportViaTelegram(document);
        }
    }
}