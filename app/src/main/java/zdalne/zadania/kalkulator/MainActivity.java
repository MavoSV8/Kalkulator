package zdalne.zadania.kalkulator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

    }

    public void simpleCalc(View view){
        Intent intent = new Intent(MainActivity.this, SimpleCalc.class);
        startActivity(intent);

    }

    public void advCalc(View view){
        Intent intent = new Intent(MainActivity.this, AdvancedCalc.class);
        startActivity(intent);

    }

    public void about(View view){
        Intent intent = new Intent(MainActivity.this, About.class);
        startActivity(intent);

    }

    public void exit(View view){
        this.finishAffinity();

    }
}