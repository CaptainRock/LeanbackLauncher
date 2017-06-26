package com.google.android.leanbacklauncher.core;

public final class LaunchException extends RuntimeException {
    public LaunchException(String message) {
        super(message);
    }

    public LaunchException(String message, Throwable cause) {
        super(message, cause);
    }
}
