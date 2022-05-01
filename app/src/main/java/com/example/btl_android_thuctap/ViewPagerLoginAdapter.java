package com.example.btl_android_thuctap;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerLoginAdapter extends FragmentStatePagerAdapter {
    public ViewPagerLoginAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new Sign_In_Fragment();
//            case 1:
//                return new Sign_Up_Fragment();
            default:
                return new Sign_In_Fragment();
        }
    }

    @Override
    public int getCount() {
        return 1;
    }
}
