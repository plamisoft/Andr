package com.example.dict;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.io.UnsupportedEncodingException;
import java.sql.SQLClientInfoException;

import static android.provider.Contacts.SettingsColumns.KEY;


public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(Context context) {
        super(context,"Login.db" , null, 2);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //създаване на таблица user
        db.execSQL("Create table user(email text primary key,password)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists user");
    }
    //метод за инсертване на информация в таблицата
    public boolean insert(String email,String password){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("email",email);
        contentValues.put("password",password);
        long ins = db.insert("user",null,contentValues);
        if (ins==-1) return false;
        else return true;
    }

    //метод за проверка на емайл
    public boolean checkmail(String email){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("Select * from user where email =?",new String[]{email});
        if (cursor.getCount()>0) return false;
        else return true;
    }
    //метод за логване на усер
    public Boolean emailpassword(String email,String password){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from user where email =? and password =?",new String[]{email,password});
        if (cursor.getCount()>0)return true;
        else return false;
    }


}
