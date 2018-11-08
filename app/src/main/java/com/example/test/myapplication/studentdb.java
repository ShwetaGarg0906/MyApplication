package com.example.test.myapplication;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class studentdb extends SQLiteOpenHelper{

    public static SQLiteDatabase database;

    public studentdb(Context context) {
        super(context, "stu", null, 3, new DatabaseErrorHandler() {
            @Override
            public void onCorruption(SQLiteDatabase dbObj) {
                Log.d("------","error");
            }
        });
        database = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE `studenttable` (\n" +
                "\t`stuid`\tINTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "\t`stuname`\tTEXT,\n" +
                "\t`age`\tINTEGER\n" +
                ");");
        db.execSQL("insert into studenttable(stuname,age) values (\"shweta\",21);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
