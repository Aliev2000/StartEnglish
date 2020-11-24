package ru.techpark.startenglish;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnModuleSelectedListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportFragmentManager().findFragmentById(R.id.fragment_container) == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragment_container, new ModulesFragment())
                    .commit();
        }
    }

    @Override
    public void onModuleSelected(String moduleName) {
        WordsFragment wordsFragment = new WordsFragment();

        Bundle bundle = new Bundle();
        bundle.putString("moduleName", moduleName);
        wordsFragment.setArguments(bundle);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, wordsFragment)
                .addToBackStack(WordsFragment.class.getSimpleName())
                .commit();
    }
}