package com.example.fragment;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

//    FirstFragment firstFragment;
    FragmentOne f1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            if(savedInstanceState==null){
                f1 = new FragmentOne();

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_holder,f1).commit();

            }


    }
}