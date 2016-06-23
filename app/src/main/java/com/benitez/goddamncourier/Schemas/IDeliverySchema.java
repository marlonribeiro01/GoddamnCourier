package com.benitez.goddamncourier.Schemas;

public interface IDeliverySchema
{
    String DELIVERY_TABLE = "DELIVERY";
    String COLUMN_ID = "ID";
    String COLUMN_COURIER_ID = "COURIER_ID";
    String COLUMN_DUE_DATE = "DUE_DATE";
    String COLUMN_SHIPPED_DATE = "SHIPPED_DATE";
    String COLUMN_DELIVERY_DATE = "DELIVERY_DATE";
    String COLUMN_CLIENT_ID = "CLIENT_ID";
    String COLUMN_STATUS = "STATUS";
    String DELIVERY_TABLE_CREATE =
            "CREATE TABLE IF NOT EXISTS " + DELIVERY_TABLE
                    + " ("
                    + COLUMN_ID + " INTEGER PRIMARY KEY, "
                    + COLUMN_COURIER_ID + " INTEGER, "
                    + COLUMN_DUE_DATE + " TEXT, "
                    + COLUMN_SHIPPED_DATE + " BIGINT, "
                    + COLUMN_DELIVERY_DATE + " BIGINT, "
                    + COLUMN_CLIENT_ID + " BIGINT, "
                    + COLUMN_STATUS + " INTEGER "
                    + ")";
}
