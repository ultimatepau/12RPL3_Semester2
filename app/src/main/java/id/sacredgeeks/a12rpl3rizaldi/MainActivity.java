package id.sacredgeeks.a12rpl3rizaldi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText alamat,nampeg,gaji;
    private RadioButton rb1, rb2, rb3, rb4, rb5;
    private String jk,gol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gaji = (EditText) findViewById(R.id.gaji);
        alamat = (EditText) findViewById(R.id.alamat);
        nampeg = (EditText) findViewById(R.id.nampeg);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        rb4 = (RadioButton) findViewById(R.id.rb4);
        rb5 = (RadioButton) findViewById(R.id.rb5);
    }

    public void submit(View view) {
        if(rb1.isChecked()) {
            jk = "Laki-Laki";
        } else {
            jk = "Perempuan";
        }

        if(rb3.isChecked()) {
            gol = "Menengah Keatas";
        } else if (rb4.isChecked()) {
            gol = "Menengah Ketengah";
        } else if (rb5.isChecked()) {
            gol = "Menengah Kebawah";
        }

        Toast.makeText(this, "Nama Pegawai : "+nampeg.getText(), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Alamat : "+alamat.getText(), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Jenis Kelamin : "+jk, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Golongan : "+gol, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Jumlah Gaji : "+gaji.getText(), Toast.LENGTH_SHORT).show();
    }
}
