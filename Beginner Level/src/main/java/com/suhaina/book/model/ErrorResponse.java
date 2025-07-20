package com.suhaina.book.model;

public class ErrorResponse {
    private int status;
    private String error;
    private String message;
    private long timestamp;

    public ErrorResponse(int status, String error, String message) {
        this.status = status;
        this.error = error;
        this.message = message;
        this.timestamp = System.currentTimeMillis();
    }

    // Getters (NO setters to keep immutable)
    public int getStatus() { return status; }
    public String getError() { return error; }
    public String getMessage() { return message; }
    public long getTimestamp() { return timestamp; }
}
