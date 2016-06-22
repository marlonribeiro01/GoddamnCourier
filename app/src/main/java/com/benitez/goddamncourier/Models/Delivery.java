package com.benitez.goddamncourier.Models;

import java.util.Date;

public class Delivery
{
    //region [ Enum ]

    private enum Status
    {
        ToBeDelivered,
        UnsuccessfullAttempt,
        Delivered,
    }

    //endregion [ Enum ]

    //region [ Fields ]

    private int id;

    private int courierId;

    private Date dueDate;

    private Date shippedDate;

    private Date deliveryDate;

    private int clientId;

    private Status status;

    //endregion [ Fields ]

    //region [ Constructors ]

    public Delivery(int courierId, Date dueDate, Date shippedDate, Date deliveryDate, int clientId, Status status)
    {
        this.id = 0;
        this.courierId = courierId;
        this.dueDate = dueDate;
        this.shippedDate = shippedDate;
        this.deliveryDate = deliveryDate;
        this.clientId = clientId;
        this.status = status;
    }

    public Delivery(int id, int courierId, Date dueDate, Date shippedDate, Date deliveryDate, int clientId, Status status)
    {
        this.id = id;
        this.courierId = courierId;
        this.dueDate = dueDate;
        this.shippedDate = shippedDate;
        this.deliveryDate = deliveryDate;
        this.clientId = clientId;
        this.status = status;
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

    public int getCourierId()
    {
        return courierId;
    }

    public void setCourierId(int courierId)
    {
        this.courierId = courierId;
    }

    public Date getDueDate()
    {
        return dueDate;
    }

    public void setDueDate(Date dueDate)
    {
        this.dueDate = dueDate;
    }

    public Date getShippedDate()
    {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate)
    {
        this.shippedDate = shippedDate;
    }

    public Date getDeliveryDate()
    {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate)
    {
        this.deliveryDate = deliveryDate;
    }

    public int getClientId()
    {
        return clientId;
    }

    public void setClientId(int clientId)
    {
        this.clientId = clientId;
    }

    public Status getStatus()
    {
        return status;
    }

    public void setStatus(Status status)
    {
        this.status = status;
    }

    //endregion [ Getters and Setters ]
}
