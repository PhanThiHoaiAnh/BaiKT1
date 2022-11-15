package com.example.baikiemtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ListCaSi extends AppCompatActivity {

    private ListView listView;
    private ArrayList<CaSi> arrayList;
    private CaSiAdapter adtCS;
    private Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_ca_si);

        btnback = findViewById(R.id.btnBackk);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logIn();
            }
        });

        listView = findViewById(R.id.list_view);
        arrayList = new ArrayList<>();
        arrayList.add(new CaSi("Adele Laurie Blue Adkins", "Adele", "Vương Quốc Anh", "4.8", R.drawable.adele));
        arrayList.add(new CaSi("Charles Otto \"Charlie\" Puth", "Charlie Puth", "Mỹ", "4.8", R.drawable.clp));
        arrayList.add(new CaSi("BangTan Boys", "BTS", "Hàn Quốc", "4.8", R.drawable.b7));
        arrayList.add(new CaSi("T-ara", "T-ARA", "Hàn Quốc", "4.8", R.drawable.t_ara));
        arrayList.add(new CaSi("Adele", "Adele", "Vương Quốc Anh", "4.8", R.drawable.adele));
        arrayList.add(new CaSi("Adele", "Adele", "Vương Quốc Anh", "4.8", R.drawable.adele));
        arrayList.add(new CaSi("Adele", "Adele", "Vương Quốc Anh", "4.8", R.drawable.adele));
        arrayList.add(new CaSi("Adele", "Adele", "Vương Quốc Anh", "4.8", R.drawable.adele));
        arrayList.add(new CaSi("Adele", "Adele", "Vương Quốc Anh", "4.8", R.drawable.adele));
        arrayList.add(new CaSi("Adele", "Adele", "Vương Quốc Anh", "4.8", R.drawable.adele));
        arrayList.add(new CaSi("Adele", "Adele", "Vương Quốc Anh", "4.8", R.drawable.adele));

        adtCS = new CaSiAdapter(ListCaSi.this, R.layout.layout_item, arrayList);
        listView.setAdapter(adtCS);
    }
    private void logIn() {
        Intent intent = new Intent(ListCaSi.this, LogIn.class);
        startActivity(intent);
    }
}