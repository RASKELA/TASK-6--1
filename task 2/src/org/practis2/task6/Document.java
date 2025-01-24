package org.practis2.task6;

import java.time.LocalDateTime;

public class Document {
    private String documentName;
    private LocalDateTime dateCreated;
    private String documentContent;
    private User signedBy;

    public Document(String documentName, String documentContent, User signedBy) {
        this.documentName = documentName;
        this.dateCreated = LocalDateTime.now();
        this.documentContent = documentContent;
        this.signedBy = signedBy;
    }

    public String getDocumentName() {
        return documentName;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public String getDocumentContent() {
        return documentContent;
    }

    public User getSignedBy() {
        return signedBy;
    }

    @Override
    public String toString() {
        return "org.practis2.task6.Document Name: " + documentName + "\n" +
                "Created At: " + dateCreated + "\n" +
                "Content: " + documentContent + "\n" +
                "Signed By: " + signedBy;
    }
}