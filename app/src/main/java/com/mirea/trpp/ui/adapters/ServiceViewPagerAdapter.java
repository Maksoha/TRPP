package com.mirea.trpp.ui.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.mirea.trpp.data.models.TabServiceModel;

import java.util.ArrayList;


public class ServiceViewPagerAdapter extends FragmentStateAdapter {

    ArrayList<Fragment> fragmentArrayList = new TabServiceModel().getFragmentArrayList();
    public ServiceViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragmentArrayList.get(position);
    }

    @Override
    public int getItemCount() {
        return fragmentArrayList.size();
    }

}
