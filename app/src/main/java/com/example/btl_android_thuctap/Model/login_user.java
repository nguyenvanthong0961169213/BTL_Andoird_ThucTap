package com.example.btl_android_thuctap.Model;

public class login_user {

    //Attributes
    private String PhoneNumber;
    private String Password;
    //private String
   //Contructer
    public login_user(String phoneNumber, String password) {
        PhoneNumber = phoneNumber;
        Password = password;
    }
    //Getters and Setter
    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public boolean validatephonenumber()
    {
        return !(getPhoneNumber().length()<10);
    }
    public boolean validatevapassword()
    {
        return !(getPhoneNumber().length()>6);
    }
}
