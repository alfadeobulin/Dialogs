package com.example.proteintracker;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proteintracker.Model.DaftarTeman;
import com.example.proteintracker.Model.DaftartemanAdapter;

import java.util.ArrayList;

public class DaftarTemanActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private DaftartemanAdapter daftartemanAdapter;
    private ArrayList<DaftarTeman>Daftartemanarrylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_teman);
        addData();

        recyclerView = findViewById(R.id.RvTeman);
        daftartemanAdapter = new DaftartemanAdapter(Daftartemanarrylist);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(DaftarTemanActivity.this);
        recyclerView .setLayoutManager(layoutManager);
        recyclerView .setAdapter( daftartemanAdapter );
    }
    private  void addData(){
        Daftartemanarrylist =  new ArrayList<>();
        Daftartemanarrylist.add(new DaftarTeman("Adrian Paskalis","72170125","Bucin","Presiden","Terus berbucin ria","Laki-aki", R.drawable.adrian));
        Daftartemanarrylist.add(new DaftarTeman("Christian Dorra","72170148","Jalan","HotmanParis","Lu jangan pada nyinyir","Laki-Laki", R.drawable.dorra));
        Daftartemanarrylist.add(new DaftarTeman("Putu Abdi Setiawan","72170172","Coding","Gamer","ya begitulah","Laki Laki", R.drawable.abdi));
        Daftartemanarrylist.add(new DaftarTeman("Desta Siwi Prabawan","72170126","Belajar","Hidup Bahagia","Tidak boleh lawan orangtua","Laki-laki", R.drawable.desta));
    }
}
