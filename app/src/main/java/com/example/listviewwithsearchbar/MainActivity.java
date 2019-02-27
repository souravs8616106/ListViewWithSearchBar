package com.example.listviewwithsearchbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    EditText editSearch;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.edtList);
        editSearch = findViewById(R.id.edtSearch);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("India");
        arrayList.add("China");
        arrayList.add("Australia");
        arrayList.add("America");
        arrayList.add("Canada");
        arrayList.add("Bhutan");
        arrayList.add("Poland");
        arrayList.add("Pakistan");
        arrayList.add("Russia");
        arrayList.add("Iran");
        arrayList.add("Brazil");
        arrayList.add("SriLanka");
        arrayList.add("Dubai");
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);
        editSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                (MainActivity.this).arrayAdapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
