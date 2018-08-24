package com.project.sagor.incomestatement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NetSalesActivity extends AppCompatActivity {

    EditText costOfGoodsSold, grossProfit;
    Button clearBtn, submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_net_sales);

        costOfGoodsSold = findViewById(R.id.costOfGoodsSoldET);
        grossProfit     = findViewById(R.id.grossProfitET);

        clearBtn        = findViewById(R.id.clearBtn);
        submitBtn       = findViewById(R.id.submitBtn);

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                costOfGoodsSold.setText("");
                grossProfit.setText("");
            }
        });

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NetSalesActivity.this, ShowResultActivity.class);
                double value1 = Double.valueOf(costOfGoodsSold.getText().toString());
                double value2 = Double.valueOf(grossProfit.getText().toString());
                double result = value1 + value2;
                Log.d("result","Result : " + result);
                intent.putExtra("result", result);
                intent.putExtra("value1", value1);
                intent.putExtra("value2", value2);
                intent.putExtra("name1","Cost Of Goods Sold");
                intent.putExtra("name2","Gross Profit");
                startActivity(intent);
            }
        });

    }
}
