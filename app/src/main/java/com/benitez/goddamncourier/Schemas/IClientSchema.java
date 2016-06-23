package com.benitez.goddamncourier.Schemas;

/**
 * Created by marlo on 6/23/2016.
 */
public interface IClientSchema
{
    String CLIENT_TABLE = "DELIVERY_ITEM";
    String COLUMN_ID = "ID";
    String COLUMN_NAME = "NAME";
    String COLUMN_ADDRESS = "ADDRESS";
    String COLUMN_PHONE = "PHONE";
    String CLIENT_TABLE_CREATE =
            "CREATE TABLE IF NOT EXISTS " + CLIENT_TABLE
                    + " ("
                    + COLUMN_ID + " INTEGER PRIMARY KEY, "
                    + COLUMN_NAME + " TEXT, "
                    + COLUMN_ADDRESS + " TEXT, "
                    + COLUMN_PHONE + " TEXT "
                    + ")";
}
