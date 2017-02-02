package id.sacredgeeks.a12rpl3rizaldi.ListView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import id.sacredgeeks.a12rpl3rizaldi.R;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        ArrayList<Siswa> arraySiswa = new ArrayList<>();
        SiswaAdapter adapter = new SiswaAdapter(this,arraySiswa);
        ListView listView = (ListView)findViewById(R.id.lsku);
        listView.setAdapter(adapter);

        Siswa siswa = new Siswa(R.mipmap.ic_launcher,"Pau Pau","XII RPL 3");
        adapter.add(siswa);
        siswa = new Siswa(R.mipmap.ic_launcher,"Muhammad Rizaldi","XII RPL 3");
        adapter.add(siswa);
        siswa = new Siswa(R.mipmap.ic_launcher,"Rizaldi","XII RPL 1");
        adapter.add(siswa);
        siswa = new Siswa(R.mipmap.ic_launcher,"Dadan Ramdhani","XII RPL 2");
        adapter.add(siswa);
    }
}
