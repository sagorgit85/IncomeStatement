package com.project.sagor.incomestatement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ShowResultActivity extends AppCompatActivity {

    private TextView resultTV, name1TV, name2TV, value1TV, value2TV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);

        resultTV    = findViewById(R.id.resultTV);
        name1TV     = findViewById(R.id.name1TV);
        name2TV     = findViewById(R.id.name2TV);
        value1TV    = findViewById(R.id.value1TV);
        value2TV    = findViewById(R.id.value2TV);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            resultTV.setText(String.valueOf(bundle.getDouble("result")));
            name1TV.setText(String.valueOf(bundle.getString("name1")));
            name2TV.setText(String.valueOf(bundle.getString("name2")));
            value1TV.setText(String.valueOf(bundle.getDouble("value1")));
            value2TV.setText(String.valueOf(bundle.getDouble("value2")));
        }

    }
}
