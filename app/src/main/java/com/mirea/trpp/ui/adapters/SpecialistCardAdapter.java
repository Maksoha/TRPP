package com.mirea.trpp.ui.adapters;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.mirea.trpp.data.models.SpecialistModel;


public class SpecialistCardAdapter extends ListAdapter<SpecialistModel, SpecialistCardViewHolder> {
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(SpecialistModel specialist);
    }
    public SpecialistCardAdapter(@NonNull DiffUtil.ItemCallback<SpecialistModel> diffCallback) {
        super(diffCallback);
    }

    @NonNull
    @Override
    public SpecialistCardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return SpecialistCardViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull SpecialistCardViewHolder holder, int position) {
        SpecialistModel current = getItem(position);
        holder.bind(current.getName().substring(0, 1), current.getName(), current.getSpeciality());
        holder.itemView.findViewById(R.id.button).setOnClickListener(v -> {
            if (listener != null) {
                listener.onItemClick(current);
            }
        });
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public static class SpecialistCardDiff extends DiffUtil.ItemCallback<SpecialistModel> {

        @Override
        public boolean areItemsTheSame(@NonNull SpecialistModel oldItem, @NonNull SpecialistModel newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull SpecialistModel oldItem, @NonNull SpecialistModel newItem) {
            return (oldItem.getName().equals(newItem.getName())
                    && oldItem.getSpeciality().equals(newItem.getSpeciality()));
        }
    }
}
