package com.benitez.goddamncourier.Models;

public class DeliveryItem
{
    //region [ Fields ]

    private int id;

    private String productName;

    private int quantity;

    private int deliveryId;

    //endregion [ Fields ]

    //region [ Constructors ]

    public DeliveryItem(String productName, int quantity, int deliveryId)
    {
        this.id = 0;
        this.productName = productName;
        this.quantity = quantity;
        this.deliveryId = deliveryId;
    }

    public DeliveryItem(int id, String productName, int quantity, int deliveryId)
    {
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
        this.deliveryId = deliveryId;
    }

    //endregion [ Constructors ]

    //region [ Getters and Setters ]

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public int getDeliveryId()
    {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId)
    {
        this.deliveryId = deliveryId;
    }

    //endregion [ Getters and Setters ]
}
