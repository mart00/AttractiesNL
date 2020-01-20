package com.example.attractienl;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class Database {

    private Context context;
    private SQLiteDatabase database;
    private Sql dbHandler;

    public Database(Context c) {
        this.context = c;

    }

    public Database open() throws SQLException {
        this.dbHandler = new Sql(this.context);
        this.database = this.dbHandler.getWritableDatabase();
        return this;
    }

    public void close() {
        this.dbHandler.close();
    }

    public String fetchCatEten() {

        Sql thedb = new Sql(context);
        SQLiteDatabase database = thedb.getWritableDatabase();
        Cursor c = database.rawQuery("SELECT categorie FROM eten ", null);
        String str = c.getString(c.getColumnIndex("categorie"));
        return str;
    }
    public String getRoute(String naam) {
        Sql thedb = new Sql(context);
        SQLiteDatabase database = thedb.getWritableDatabase();
//        String query = "SELECT img FROM parken WHERE NaamPark ='"+naam+"'";
        Cursor c = database.rawQuery("SELECT img FROM parken WHERE NaamPark = '"+naam+"'" , null);
//        Cursor c = database.rawQuery(query, null);
//        c.moveToPosition(0);
        return c.getString(c.getColumnIndex("NaamPark"));

    }
    public String getRoute(long id) {

        String rv = "not found";
        Sql thedb = new Sql(context);
        SQLiteDatabase database = thedb.getWritableDatabase();
        String whereclause = "ID=?";
        String[] whereargs = new String[]{String.valueOf(id)};
        Cursor csr = database.query(thedb.TABLE_NAME,null,whereclause,whereargs,null,null,null);
        if (csr.moveToFirst()) {
            rv = csr.getString(csr.getColumnIndex(thedb.COL6));
        }
        return rv;
    }
}