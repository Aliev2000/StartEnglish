package ru.techpark.startenglish;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class WordsFragment extends Fragment {
    private WordAdapter wordAdapter;
    private String moduleName;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            moduleName = savedInstanceState.getString("moduleName", "default");
        }

        wordAdapter = new WordAdapter(moduleName);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.word_list, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.word_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView.setAdapter(wordAdapter);

/*
        view.findViewById(R.id.add_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentListSize++;
                numbersAdapter.addItem();
                numbersAdapter.notifyItemInserted(currentListSize - 1);
            }
        });
*/
        return view;
    }

}
