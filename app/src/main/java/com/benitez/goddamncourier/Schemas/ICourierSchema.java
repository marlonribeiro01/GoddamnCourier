package com.benitez.goddamncourier.Schemas;

/**
 * Created by marlo on 6/23/2016.
 */
public interface ICourierSchema
{
    String COURIER_TABLE = "COURIER";
    String COLUMN_ID = "ID";
    String COLUMN_NAME = "NAME";
    String COLUMN_USERNAME = "USERNAME";
    String COLUMN_PASSWORD = "PASSWORD";
    String COLUMN_PHONE = "PHONE";
    String DELIVERY_TABLE_CREATE =
            "CREATE TABLE IF NOT EXISTS " + COURIER_TABLE
                    + " ("
                    + COLUMN_ID + " INTEGER PRIMARY KEY, "
                    + COLUMN_NAME + " TEXT, "
                    + COLUMN_USERNAME + " TEXT, "
                    + COLUMN_PASSWORD + " TEXT, "
                    + COLUMN_PHONE + " TEXT "
                    + ")";
}
