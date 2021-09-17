package id.ac.umn.moh.rizkizidane;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnsend, btnbrowse;
    EditText etisi, eturl;
    TextView jawaban;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsend = findViewById(R.id.btnsend);
        btnbrowse = findViewById(R.id.btnbrowse);
        etisi = findViewById(R.id.etisi);
        eturl = findViewById(R.id.eturl);
        jawaban = findViewById(R.id.jawaban);

        btnbrowse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlText = eturl.getText().toString();
                if(urlText.isEmpty()){
                    urlText = "http://www.umn.ac.id/";
                }
                Intent browseintent = new Intent(Intent.ACTION_VIEW);
                browseintent.setData(Uri.parse(urlText));
                if(browseintent.resolveActivity(getPackageManager()) != null){
                    startActivity(browseintent);
                }

            }
        });

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                String text = etisi.getText().toString();
                intent.putExtra("PesanDariMain", text);
                startActivity(intent);
            }
        });



    }

}