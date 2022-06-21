package kg.geektech.homework5g45;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import kg.geektech.homework5g45.databinding.ItemMusicBinding;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private ArrayList<MusicModel> musicModels;
    private OnItemClick onItemClick;

    public ListAdapter(ArrayList<MusicModel> musicModels, OnItemClick onItemClick) {
        this.musicModels = musicModels;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MusicModel model = musicModels.get(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClick.onItemClick();
            }
        });
        holder.bind(String.valueOf(position+1), model.getName(), model.getSecondName(), model.getTime());

    }

    @Override
    public int getItemCount() {
        return musicModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemMusicBinding binding;
        public ViewHolder(ItemMusicBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(String position, String name, String secondName, String time){
            binding.itemMusicCount.setText(position);
            binding.itemMusicName.setText(name);
            binding.itemMusicSecondName.setText(secondName);
            binding.itemMusicTime.setText(time);
        }
    }
}
