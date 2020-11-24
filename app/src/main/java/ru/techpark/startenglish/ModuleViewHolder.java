package ru.techpark.startenglish;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ModuleViewHolder extends RecyclerView.ViewHolder {
    private TextView name;
    private TextView wordCount;
    private LinearLayout moduleCard;

    public ModuleViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.module_model_name);
        wordCount = itemView.findViewById(R.id.module_model_word_count);
        moduleCard = itemView.findViewById(R.id.module_card);
        moduleCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ModulesFragment.onModuleSelectedListener != null) {
                    ModulesFragment.onModuleSelectedListener.onModuleSelected(String.valueOf(name.getText()));
                }
            }
        });
    }

    public TextView getName() {
        return name;
    }

    public TextView getWordCount() {
        return wordCount;
    }
}