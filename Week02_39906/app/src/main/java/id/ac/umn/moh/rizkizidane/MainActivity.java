package id.ac.umn.moh.rizkizidane;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Angka1, Angka2;
    TextView hasil;
    Button btnTambaH, btnKuranG, btnKali, btnBagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Angka1 = (EditText) this.findViewById(R.id.Angka1);
        Angka2 = (EditText) this.findViewById(R.id.Angka2);
        hasil = (TextView) this.findViewById(R.id.hasil);
        btnTambaH = (Button) this.findViewById(R.id.btnTambaH);
        btnKuranG = (Button) this.findViewById(R.id.btnKuranG);
        btnKali = (Button) this.findViewById(R.id.btnKali);
        btnBagi = (Button) this.findViewById(R.id.btnBagi);

        btnTambaH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { hitung( '+'); } } );
        btnKuranG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { hitung( '-'); } } );
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { hitung( '*'); } } );
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { hitung( '/'); } } );
    }

    protected void hitung(char operator){
        double operand1 = Double.parseDouble(Angka1.getText().toString());
        double operand2 = Double.parseDouble(Angka2.getText().toString());
        double result = 0.0;
        switch (operator){
            case('+') : result = operand1 + operand2; break;
            case('-') : result = operand1 - operand2; break;
            case('*') : result = operand1 * operand2; break;
            case('/') : result = operand1 / operand2; break;
        }
        hasil.setText(String.valueOf(result));
    }
}