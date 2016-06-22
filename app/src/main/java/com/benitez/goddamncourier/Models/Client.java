package com.benitez.goddamncourier.Models;

public class Client
{
    //region [ Fields ]

    private int id;

    private String name;

    private String address;

    private String phone;

    //endregion [ Fields ]

    //region [ Constructors ]

    public Client(String name, String address, String phone)
    {
        this.id = 0;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public Client(int id, String name, String address, String phone)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
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

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    //endregion [ Getters and Setters ]
}
