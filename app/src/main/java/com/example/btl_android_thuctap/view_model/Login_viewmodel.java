package com.example.btl_android_thuctap.view_model;

import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;

import com.example.btl_android_thuctap.BR;
import com.example.btl_android_thuctap.Model.login_user;

public class Login_viewmodel extends BaseObservable{
    //Attributes
    private String PhoneNumber;
    private String Password;
    public ObservableField<String> validate=new ObservableField<>("kaka");


    //Getters and Setter
    @Bindable
    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
        notifyPropertyChanged(BR.phoneNumber);
    }
    @Bindable
    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
        notifyPropertyChanged(BR.password);
    }

    public void Onclick()
    {
        login_user user = new login_user(getPhoneNumber(),getPassword());
        setPhoneNumber("1111");
        if(user.validatevapassword() && user.validatephonenumber()){
            validate.set("thanh cong");
        }else {
            validate.set("that bai");
        }
    }

}
