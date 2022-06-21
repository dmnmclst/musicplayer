package kg.geektech.homework5g45;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import kg.geektech.homework5g45.databinding.FragmentListSongBinding;
import kg.geektech.homework5g45.databinding.FragmentTitleBinding;

public class ListSongFragment extends Fragment implements OnItemClick{
    private FragmentListSongBinding binding;
    private ArrayList<MusicModel> models;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentListSongBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        binding.fragmentListSongRecyclerView.setAdapter(new ListAdapter(models, this));
    }

    private void loadData() {
        models = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            models.add(new MusicModel("Blank Space", "Taylor Swift", "3:19"));
        }
    }

    @Override
    public void onItemClick() {
        Intent intent = new Intent(getActivity(), SecondActivity.class);
        startActivity(intent);
    }
}