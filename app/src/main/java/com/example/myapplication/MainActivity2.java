package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import android.widget.TextView;
import android.os.Bundle;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView messageText = findViewById(R.id.messageText);

        Bundle arguments = getIntent().getExtras();
        if (arguments != null) {
            String name = arguments.get("name").toString();
            String group = arguments.get("group").toString();
            int age = arguments.getInt("age");
            int score = arguments.getInt("score");
            messageText.setText("Имя: " + name + "\nГруппа: " + group + "\nВозраст: " + age + "\nЖелаемые баллы: " + score);
        }
        setContentView(messageText);


        // Получаем Intent
//        Intent intent = getIntent();
        // Извлекаем данные
 //       String message = intent.getStringExtra("EXTRA_MESSAGE");

        // Находим TextView и отображаем полученные данные
 //       TextView textView = findViewById(R.id.textView);
 //       textView.setText(message);
    }

}