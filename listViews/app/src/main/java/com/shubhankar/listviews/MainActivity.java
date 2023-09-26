package com.shubhankar.listviews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> arrNames= new ArrayList<>();
    Spinner spinner;
    ArrayList<String> arrIds= new ArrayList<>();
    AutoCompleteTextView actxtView;

    ArrayList<String> arrLanguages=new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.list_View);
        spinner=findViewById(R.id.Spinner);
        actxtView=findViewById(R.id.actxtView);

        arrNames.add("RAM");
        arrNames.add("krishna");
        arrNames.add("RAM");
        arrNames.add("krishna");
        arrNames.add("RAM");
        arrNames.add("krishna");
        arrNames.add("RAM");
        arrNames.add("krishna");
        arrNames.add("RAM");
        arrNames.add("krishna");
//this arrayadapter take three items textview where it show the data and array where it store data
        //simple_list_itm is inbuilt file for to show the text
        ArrayAdapter<String> adapter=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,arrNames);
        listView.setAdapter(adapter);//list where it shows the data

        //now we have to perform operation when an item is clicked in list
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Toast.makeText(MainActivity.this, "clicked on first item", Toast.LENGTH_SHORT).show();
                }
            }
        });


        //spiner
        arrIds.add("adhar card");
        arrIds.add("PAN card");
        arrIds.add("voter Id card");
        arrIds.add("Driving license card");
        arrIds.add("12th marksheet card");
        arrIds.add("adhar card");

        ArrayAdapter<String> spinnerAdapter=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,arrIds);
        spinner.setAdapter(spinnerAdapter);


        //autoCompleter text view
        arrLanguages.add("hindi");
        arrLanguages.add("c++");
        arrLanguages.add("java");
        arrLanguages.add("c#");
        arrLanguages.add("python");
        arrLanguages.add("php");

        ArrayAdapter<String> actvAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrLanguages);
        actxtView.setAdapter(actvAdapter);
        actxtView.setThreshold(1);

    }
}




