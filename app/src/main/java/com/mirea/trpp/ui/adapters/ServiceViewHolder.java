package com.mirea.trpp.ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ServiceViewHolder extends RecyclerView.ViewHolder {
    private CardServiceBookingBinding binding;

    public ServiceViewHolder(@NonNull View itemView) {
        super(itemView);

        binding = CardServiceBookingBinding.bind(itemView);
    }

    public void bind (String name, int price) {
        binding.cardServiceBookingServiceName.setText(name);
        binding.cardServiceBookingServicePrice.setText(price + " руб.");
    }

    static ServiceViewHolder create(ViewGroup parent) {
        CardServiceBookingBinding mBinding = CardServiceBookingBinding
                .inflate(LayoutInflater.from(parent.getContext()), parent, false);
        View view = mBinding.getRoot();
        return new ServiceViewHolder(view);
    }
}
