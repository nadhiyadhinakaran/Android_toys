package com.ns.androidtoys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView listoftoys;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listoftoys=(TextView)findViewById(R.id.toy_names);
        ToyBox toy=new ToyBox();
        String toyNames[]=ToyBox.getToyNames();
        for (String name:toyNames
             ) {
            listoftoys.append(name+"\n\n\n");

        }
    }
}
