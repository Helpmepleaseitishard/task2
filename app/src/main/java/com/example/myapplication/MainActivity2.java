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
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String group = intent.getStringExtra("group");
        String age = intent.getStringExtra("age");
        String score = intent.getStringExtra("score");
        TextView messageText1 = findViewById(R.id.messageText);
        messageText1.setText("Имя: " + name + "\nГруппа: " + group + "\nВозраст: " + age + "\nЖелаемые баллы: " + score);


        // Извлекаем данные
 //       String message = intent.getStringExtra("EXTRA_MESSAGE");

        // Находим TextView и отображаем полученные данные
 //       TextView textView = findViewById(R.id.textView);
 //       textView.setText(message);
    }

}