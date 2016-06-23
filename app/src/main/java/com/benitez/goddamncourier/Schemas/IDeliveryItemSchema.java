package com.benitez.goddamncourier.Schemas;

/**
 * Created by marlo on 6/23/2016.
 */
public interface IDeliveryItemSchema
{
    String DELIVERY_ITEM_TABLE = "DELIVERY_ITEM";
    String COLUMN_ID = "ID";
    String COLUMN_PRODUCT_NAME = "PRODUCT_NAME";
    String COLUMN_QUANTITY = "QUANTITY";
    String COLUMN_DELIVERY_ID = "DELIVERY_ID";
    String DELIVERY_ITEM_TABLE_CREATE =
            "CREATE TABLE IF NOT EXISTS " + DELIVERY_ITEM_TABLE
                    + " ("
                    + COLUMN_ID + " INTEGER PRIMARY KEY, "
                    + COLUMN_PRODUCT_NAME + " TEXT, "
                    + COLUMN_QUANTITY + " INTEGER, "
                    + COLUMN_DELIVERY_ID + " INTEGER "
                    + ")";
}
