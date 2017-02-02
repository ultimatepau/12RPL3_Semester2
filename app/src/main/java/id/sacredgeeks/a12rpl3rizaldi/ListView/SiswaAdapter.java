package id.sacredgeeks.a12rpl3rizaldi.ListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sacredgeeks.a12rpl3rizaldi.R;

/**
 * Created by SacredGeeks on 2/2/2017.
 */

public class SiswaAdapter extends ArrayAdapter<Siswa> {
    public SiswaAdapter(Context context, ArrayList<Siswa> siswa) {
        super(context,0,siswa);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        Siswa siswa = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row,parent,false);
        }
        ImageView imgFoto = (ImageView)convertView.findViewById(R.id.imgku);
        TextView tvNama = (TextView)convertView.findViewById(R.id.tvNama);
        TextView tvKelas= (TextView)convertView.findViewById(R.id.tvKelas);

        imgFoto.setImageResource(siswa.fotoID);
        tvNama.setText(siswa.nama);
        tvKelas.setText(siswa.kelas);

        return convertView;
    }
}
