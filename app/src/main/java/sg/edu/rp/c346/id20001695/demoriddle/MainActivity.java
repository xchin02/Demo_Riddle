package sg.edu.rp.c346.id20001695.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvQ1;
    TextView btnRevealQ1, btnRevealQ2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvQ1 = findViewById(R.id.textViewQ1);
        btnRevealQ1 = findViewById(R.id.buttonRevealQ1);
        btnRevealQ2 = findViewById(R.id.buttonRevealQ2);

        Log.d("MainActivity", "onCreate() called.");

        btnRevealQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Question", "Q1");
                startActivity(intent);
            }
        });

        btnRevealQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Question", "Q2");
                startActivity(intent);
            }
        });
    }
    protected void onStart() {
        Log.d("MainActivity", "onStart() called.");
        super.onStart();
    }

    protected void onResume() {
        Log.d("MainActivity", "onResume() called.");
        super.onResume();
    }

    protected void onPause() {
        Log.d("MainActivity", "onPause() called.");
        super.onPause();
    }

    protected void onStop() {
        Log.d("MainActivity", "onStop() called.");
        super.onStop();
    }

    protected void onDestroy() {
        Log.d("MainActivity", "onDestroy() called.");
        super.onDestroy();
    }

    protected void onRestart() {
        Log.d("MainActivity", "onRestart() called.");
        super.onRestart();
    }

}