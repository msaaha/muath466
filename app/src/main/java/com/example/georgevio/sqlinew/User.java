package com.example.georgevio.sqlinew;

/**
 * Created by Mitch on 2016-05-13.
 */
public class User {
    private String Name;
    private String Phone;
    private String Email;
    private String Street;

    public User(String name, String phone, String email, String street){
        Name = name;
        Phone = phone;
        Email = email;
        Street = street;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getName() {
        return Name;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
    public String getPhone() {
        return Phone;
    }

    public void setEmail(String email) {
        Email = email;
    }
    public String getEmail() {
        return Email;
    }

    public void setStreet(String street) { Street = street; }
    public String getStreet() {
        return Street;
    }


}
