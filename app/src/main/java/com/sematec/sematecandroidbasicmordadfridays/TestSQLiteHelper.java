package com.sematec.sematecandroidbasicmordadfridays;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class TestSQLiteHelper extends SQLiteOpenHelper {

    String TABLE_NAME = "Students";

    public TestSQLiteHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE_QUERY = "CREATE TABLE " + TABLE_NAME + "(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT," +
                "family TEXT," +
                "grade INTEGER," +
                "nCode TEXT" +
                ")";
        db.execSQL(CREATE_TABLE_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }


    void insertStudent(String name, String family, int grade) {
        String INSERT_STUDENT_QUERY = "INSERT INTO " + TABLE_NAME + "(name,family,grade)VALUES"
                + "(" +
                "'" + name + "'" + "," +
                "'" + family + "'" + "," +
                grade +
                ")";
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(INSERT_STUDENT_QUERY);
        db.close();
    }

    String getAllStudentsNames() {
        String result = "";
        String STUDENTS_NAMES_QUERY = "SELECT name FROM " + TABLE_NAME;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(STUDENTS_NAMES_QUERY, null);

        while (cursor.moveToNext()) {
            result = result + cursor.getString(0) + "\n";
        }

        db.close();
        return result;
    }
}
