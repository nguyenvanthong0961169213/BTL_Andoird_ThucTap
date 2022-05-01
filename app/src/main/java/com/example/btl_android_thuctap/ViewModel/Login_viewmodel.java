package com.example.btl_android_thuctap.ViewModel;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;

import com.example.btl_android_thuctap.BR;
import com.example.btl_android_thuctap.Model.login_user;

public class Login_viewmodel extends BaseObservable {
    //Attributes
    private String PhoneNumber;
    private String Password;
    public ObservableField<String> validate=new ObservableField<>();

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
        login_user user=new login_user(getPhoneNumber(),getPassword());
        if(user.validatephonenumber()==false||user.validatevapassword()==false)
        {
            validate.set("Lỗi Tài Khoản và mật khẩu");
        }
    }
}
