package com.google.android.leanbacklauncher.tvrecommendations.service;

import android.net.Uri;

public interface DbMigrationContract {
    public static final Uri CONTENT_UPDATE_URI =  Uri.parse("content://com.android.google.tvrecommendations.migration/migrated");
    public static final Uri CONTENT_URI = Uri.parse("content://com.android.google.tvrecommendations.migration/data");

   /* static {
        CONTENT_URI = Uri.parse("content://com.android.google.tvrecommendations.migration/data");
        CONTENT_UPDATE_URI = Uri.parse("content://com.android.google.tvrecommendations.migration/migrated");
    }*/
}
