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
        Button btn1 = findViewById(R.id.button); // ID кнопки
        btn1.setOnClickListener(this);// обработчик нажатия на кнопку
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
        EditText nameText = findViewById(R.id.editText1);
        EditText groupText = findViewById(R.id.editText2);
        EditText ageText = findViewById(R.id.editText3);
        EditText scoreText = findViewById(R.id.editText4);
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("name", nameText.getText().toString());
        intent.putExtra("group", groupText.getText().toString());
        intent.putExtra("age", ageText.getText().toString());
        intent.putExtra("score", scoreText.getText().toString());
        startActivity(intent);

    }
    public void navigateToSecondActivity(View view) {

        EditText nameText = findViewById(R.id.editText1);
        EditText groupText = findViewById(R.id.editText2);
        EditText ageText = findViewById(R.id.editText3);
        EditText scoreText = findViewById(R.id.editText4);
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("name", nameText.getText().toString());
        intent.putExtra("group", groupText.getText().toString());
        intent.putExtra("age", ageText.getText().toString());
        intent.putExtra("score", scoreText.getText().toString());
        startActivity(intent);
    }
}
