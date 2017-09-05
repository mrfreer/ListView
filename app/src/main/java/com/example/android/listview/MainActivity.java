package com.example.android.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static ListView listView;
    private static String [] NAMES = {"Tom", "Mark", "John", "Jack", "Patrick", "Peter"};
    //use the array to populate the listView
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView();
    }

    public void listView(){
        listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.name_list, NAMES);
        listView.setAdapter(adapter); //pass the adapter
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = (String) listView.getItemAtPosition(i);
                        Toast.makeText(MainActivity.this, "Position : " + i + " Value: " + value,
                                Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
