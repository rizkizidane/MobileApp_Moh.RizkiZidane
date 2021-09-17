package id.ac.umn.moh.rizkizidane;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView pesanTerima;
    EditText jawaban;
    Button balasKirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        pesanTerima = findViewById(R.id.pesanTerima);
        jawaban = findViewById(R.id.pesanBalik);
        balasKirim = findViewById(R.id.kirimBalik);
        Intent mainIntent = getIntent();
        String pesanTerima1 = mainIntent.getStringExtra("PesanDariMain");
        pesanTerima.setText(pesanTerima1);
    }

    public void kirimBalik(View view){
        String jawaban1 = jawaban.getText().toString();
        Intent balasIntent = new Intent();
        balasIntent.putExtra("Jawaban", jawaban1);
        setResult(RESULT_OK, balasIntent);
        finish();
    }
}
