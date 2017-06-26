package com.google.android.leanbacklauncher.apps;

public interface InstallingLaunchPointListener {
    void onInstallingLaunchPointAdded(LaunchPoint launchPoint);

    void onInstallingLaunchPointChanged(LaunchPoint launchPoint);

    void onInstallingLaunchPointRemoved(LaunchPoint launchPoint, boolean z);
}
