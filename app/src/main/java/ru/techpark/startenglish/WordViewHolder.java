package ru.techpark.startenglish;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WordViewHolder extends RecyclerView.ViewHolder {
    private TextView name;

    public WordViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.word_model_name);
        /*mNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainFragment.onNumberSelectedListener.onNumberSelected(
                        Integer.parseInt(((TextView) v).getText().toString()),
                        ((TextView) v).getCurrentTextColor());
            }
        });*/
    }

    public TextView getName() {
        return name;
    }
}
