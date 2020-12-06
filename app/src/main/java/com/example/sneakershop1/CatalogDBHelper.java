package com.example.sneakershop1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class CatalogDBHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "catalog.db";
    private static final int DB_VERSION = 1;

    public CatalogDBHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CatalogContract.CatalogEntry.CREATE_COMMAND);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(CatalogContract.CatalogEntry.DROP_COMMAND);
        onCreate(db);
    }
}

