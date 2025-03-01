package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("RRR","Я родился (создалось)");
        Button btn = findViewById(R.id.button); // ID кнопки
        btn.setOnClickListener(this);// обработчик нажатия на кнопку
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d("RRR","СТАРТУЕМ (страртануло)");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("RRR","Начинаем (возобновлено)");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("RRR","Чтож, продолжим (рестартнуло)");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("RRR","Поработали, и хватит (стопанулось)");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("RRR","Пожили, и хватит (уничтожилось)");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("RRR","А вот тут приостановись (поставились на паузу)");
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        // Сообщение на вывод
        EditText nameText = findViewById(R.id.editText1);
        EditText ageText = findViewById(R.id.editText3);

        String name = nameText.getText().toString();
        int age = Integer.parseInt(ageText.getText().toString());

        intent.putExtra("name", name);
        intent.putExtra("age", age);

        startActivity(intent); // НЕ ЗАБУДЬТЕ, СУКА, startActivity для запуска новой активности

    }

    public void navigateToSecondActivity(View view) {

        EditText nameText = findViewById(R.id.editText1);
        EditText groupText = findViewById(R.id.editText2);
        EditText ageText = findViewById(R.id.editText3);
        EditText scoreText = findViewById(R.id.editText4);

        String name = nameText.getText().toString();
        String group = nameText.getText().toString();
        int age = Integer.parseInt(ageText.getText().toString());
        int score = Integer.parseInt(ageText.getText().toString());

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("name", name);
        intent.putExtra("group", group);
        intent.putExtra("age", age);
        intent.putExtra("score", score);
        startActivity(intent);
    }
}
