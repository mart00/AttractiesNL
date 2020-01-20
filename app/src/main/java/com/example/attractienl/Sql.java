package com.example.attractienl;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Sql extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 6;
    protected static final String DATABASE_NAME = "pretparken";
    private static final String COL1 = "ID";
    private static final String COL2 = "NaamPark";
    private static final String COL3 = "Plaats";
    private static final String COL4 = "Lat";
    private static final String COL5 = "Lng";
    private static final String COL6 = "img";

    public Sql(Context context){
        super(context, DATABASE_NAME, null,  DATABASE_VERSION);
    }

    @Override

    public void onCreate(SQLiteDatabase db){

        insert(db);

    }
    @Override

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS dieren01");
        db.execSQL("DROP TABLE IF EXISTS dieren02");
        db.execSQL("DROP TABLE IF EXISTS eten");
        onCreate(db);
    }


    public void insert(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE parken" + "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "NaamPark TEXT, " + " Plaats TEXT, " + " Lat INTEGER, " + " Lng INTEGER, " + " img TEXT) ");
        db.execSQL("INSERT INTO parken (NaamPark, Plaats, Lat, Lng, img) VALUES ('De Efteling', 'Kaatsheuvel', '5,04604','51,64683', 'efteling.jpg')");
        db.execSQL("INSERT INTO parken (NaamPark, Plaats, Lat, Lng, img) VALUES ('Slagharen', 'Slagharen', '6,56433','52,61951', 'slagharen.jpg')");
        db.execSQL("INSERT INTO parken (NaamPark, Plaats, Lat, Lng, img) VALUES ('Drunense Duinen', 'Drunen', '5,12032','51,64651', 'drunenseduinen.jpg')");
        db.execSQL("INSERT INTO parken (NaamPark, Plaats, Lat, Lng, img) VALUES ('Drievliet', 'Den Haag', '4,35419','52,05493', 'drievliet.jpg')");
        db.execSQL("INSERT INTO parken (NaamPark, Plaats, Lat, Lng, img) VALUES ('Duinrell', 'Wassenaar', '4,38543','52,14865', 'duinrell.jpg')");
        db.execSQL("INSERT INTO parken (NaamPark, Plaats, Lat, Lng, img) VALUES ('Julianatoren', 'Apeldoorn', '5,89718','52,18120', 'julianatoren.jpg')");
        db.execSQL("INSERT INTO parken (NaamPark, Plaats, Lat, Lng, img) VALUES ('Dolfinarium', 'Harderwijk', '5,61807','52,35369', 'dolfinarium.jpg')");
        db.execSQL("INSERT INTO parken (NaamPark, Plaats, Lat, Lng, img) VALUES ('Walibi', 'Biddinghuizen', '5,68212','52,44754', 'walibi.jpg')");
        db.execSQL("INSERT INTO parken (NaamPark, Plaats, Lat, Lng, img) VALUES ('Beeksebergen', 'Hilvarenbeek', '5,13042','51,52050', 'beeksebergen.jpg')");
        db.execSQL("INSERT INTO parken (NaamPark, Plaats, Lat, Lng, img) VALUES ('Plopsaland', 'De Panne', '2,59681','51,08091', 'depanne.jpg')");
    }
}