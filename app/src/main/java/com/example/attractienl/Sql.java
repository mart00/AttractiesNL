package com.example.attractienl;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Sql extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 10;
    protected static final String DATABASE_NAME = "pretparken";
    static final String TABLE_NAME = "parken";
     static final String COL1 = "ID";
     static final String COL2 = "NaamPark";
     static final String COL3 = "Plaats";
     static final String COL4 = "Lat";
     static final String COL5 = "Lng";
     static final String COL6 = "img";

    public Sql(Context context){
        super(context, DATABASE_NAME, null,  DATABASE_VERSION);
    }

    @Override

    public void onCreate(SQLiteDatabase db){

        insert(db);

    }
    @Override

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS parken");
        onCreate(db);
    }


    public void insert(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE parken" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "NaamPark TEXT, " + " Plaats TEXT, " + " Lat INTEGER, " + " Lng INTEGER, " + " img TEXT)");
        db.execSQL("INSERT INTO parken (NaamPark, Plaats, Lat, Lng, img) VALUES ('De Efteling', 'Kaatsheuvel', '5,04604','51,64683', 'drawable/efteling')");
        db.execSQL("INSERT INTO parken (NaamPark, Plaats, Lat, Lng, img) VALUES ('Slagharen', 'Slagharen', '6,56433','52,61951', 'drawable/slagharen')");
        db.execSQL("INSERT INTO parken (NaamPark, Plaats, Lat, Lng, img) VALUES ('Drunense Duinen', 'Drunen', '5,12032','51,64651', 'drawable/drunenseduinen')");
        db.execSQL("INSERT INTO parken (NaamPark, Plaats, Lat, Lng, img) VALUES ('Drievliet', 'Den Haag', '4,35419','52,05493', 'drawable/drievliet')");
        db.execSQL("INSERT INTO parken (NaamPark, Plaats, Lat, Lng, img) VALUES ('Duinrell', 'Wassenaar', '4,38543','52,14865', 'drawable/duinrell')");
        db.execSQL("INSERT INTO parken (NaamPark, Plaats, Lat, Lng, img) VALUES ('Julianatoren', 'Apeldoorn', '5,89718','52,18120', 'drawable/julianatoren')");
        db.execSQL("INSERT INTO parken (NaamPark, Plaats, Lat, Lng, img) VALUES ('Dolfinarium', 'Harderwijk', '5,61807','52,35369', 'drawable/dolfinarium')");
        db.execSQL("INSERT INTO parken (NaamPark, Plaats, Lat, Lng, img) VALUES ('Walibi', 'Biddinghuizen', '5,68212','52,44754', 'drawable/walibi')");
        db.execSQL("INSERT INTO parken (NaamPark, Plaats, Lat, Lng, img) VALUES ('Beeksebergen', 'Hilvarenbeek', '5,13042','51,52050', 'drawable/beeksebergen')");
        db.execSQL("INSERT INTO parken (NaamPark, Plaats, Lat, Lng, img) VALUES ('Plopsaland', 'De Panne', '2,59681','51,08091', 'drawable/plopsaland')");
    }
}