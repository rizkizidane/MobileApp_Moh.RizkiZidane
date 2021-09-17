package id.ac.umn.moh.rizkizidane;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etisian;
    private Button btnOne, btnTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOne = findViewById(R.id.main_bottom_change1);
        btnTwo = findViewById(R.id.main_bottom_change2);
        etisian = findViewById(R.id.fragment1_editText_tulisan);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent intentDua = new Intent(MainActivity.this, SecondActivity.class);
              String name = etisian.getText().toString();
              intentDua.putExtra("Name", name);
              startActivity(intentDua);
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentTiga = new Intent(MainActivity.this, ThirdActivity.class);
                String name = etisian.getText().toString();
                intentTiga.putExtra("Name", name);
                startActivity(intentTiga);
            }
        });

    }
}