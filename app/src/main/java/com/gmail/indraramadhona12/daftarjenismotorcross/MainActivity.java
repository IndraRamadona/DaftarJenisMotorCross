package com.gmail.indraramadhona12.daftarjenismotorcross;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView simpleList;
    String  Item[] = {"KTM 2 tak", "KTM 2 tak", "Enduro KTM", "Enduro KTM", "KTM 2 Tak", "Enduro KTM"};
    String  SubItem[] = {"motor cross modifikasi dengan menggunakan mesin super 2 tak.",
            "motor cross modifikasi dengan menggunakan mesin super 2 tak.",
            "motor cross modifikasi dengan menggunakan mesin enduro ktm 350 CC.",
            "motor cross modifikasi dengan menggunakan mesin ktm 2 tak.",
            "motor cross modifikasi dengan menggunakan mesin turbo enduro 250 CC.",
            "motor cross modifikasi dengan menggunakan mesin enduro 350 CC."};
    int flags[] = {R.drawable.ktm1, R.drawable.ktm2, R.drawable.ktm3, R.drawable.ktm4, R.drawable.ktm5, R.drawable.ktm6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleList = (ListView)findViewById(R.id.ListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), Item,SubItem, flags);
        simpleList.setAdapter(customAdapter);
    }
}

