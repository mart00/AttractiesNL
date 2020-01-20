package com.example.attractienl;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class Database {

        private Context context;
        private SQLiteDatabase database;
        private Sql dbHandler;

        public Database(Context c){
            this.context = c;

        }

        public Database open() throws SQLException {
            this.dbHandler = new Sql(this.context);
            this.database = this.dbHandler.getWritableDatabase();
            return this;
        }
        public void close(){
            this.dbHandler.close();
        }
        public String fetchCatDieren01() {

            Sql thedb = new Sql(context);
            SQLiteDatabase database = thedb.getWritableDatabase();
            Cursor c = database.rawQuery("SELECT categorie FROM dieren01 ", null);
            c.moveToPosition(0);
            String str = c.getString(c.getColumnIndex("categorie"));
            return str;
        }
        public String fetchCatDieren02() {

            Sql thedb = new Sql(context);
            SQLiteDatabase database = thedb.getWritableDatabase();
            Cursor c = database.rawQuery("SELECT categorie FROM dieren02 ", null);
            c.moveToPosition(0);
            String str = c.getString(c.getColumnIndex("categorie"));
            return str;
        }
        public String fetchCatEten() {

            Sql thedb = new Sql(context);
            SQLiteDatabase database = thedb.getWritableDatabase();
            Cursor c = database.rawQuery("SELECT categorie FROM eten ", null);
            String str = c.getString(c.getColumnIndex("categorie"));
            return str;
        }

        //pak alle tabellen / categorieen
        public Cursor getCategorie() {
            Sql thedb = new Sql(context);
            SQLiteDatabase database = thedb.getWritableDatabase();
            Cursor c = database.rawQuery("SELECT name FROM sqlite_master WHERE type='table' ORDER BY name", null);
            return c;
        }}
//        String getCategorie = "not found";
//        String whereclause = "ID=?";
//        String[] whereargs = new String[]{String.valueOf(id)};
//        Cursor cursor = database.query(,null,whereclause,whereargs,null,null,null);
//        if (cursor.moveToFirst()) {
//            getCategorie = cursor.getString(cursor.getColumnIndex(COL4));
//        }
//        cursor.close();
//        db.close();
//        return getCategorie;

        //werkt niet zonder de juiste categorie te kunnen pakken verplaatsen naar oefen?
//    public String getRoute(long id) {
//
//        SqliteHandeler thedb = new SqliteHandeler(context);
//        String getroute = "not found";
//        SQLiteDatabase database = thedb.getWritableDatabase();
//        String whereclause = "ID=?";
//        String[] whereargs = new String[]{String.valueOf(id)};
//        Cursor cursor = thedb.query(TABLE_NAME,null,whereclause,whereargs,null,null,null);
//        if (cursor.moveToFirst()) {
//            getroute = cursor.getString(cursor.getColumnIndex(COL4));
//        }
//        cursor.close();
//        db.close();
//        return getroute;
//    }
//    public String getName(long id) {
//
//        String itemNaam = "not found";
//        SQLiteDatabase db = this.getWritableDatabase();
//        String whereclause = "ID=?";
//        String[] whereargs = new String[]{String.valueOf(id)};
//        Cursor cursor = db.query(TABLE_NAME,null,whereclause,whereargs,null,null,null);
//        if (cursor.moveToFirst()) {
//            itemNaam = cursor.getString(cursor.getColumnIndex(COL3));
//        }
//        cursor.close();
//        db.close();
//        return itemNaam;
//    }




