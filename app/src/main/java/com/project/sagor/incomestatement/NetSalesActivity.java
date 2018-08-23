package com.project.sagor.incomestatement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
                double value1 = Double.valueOf(costOfGoodsSold.getText().toString());
                double value2 = Double.valueOf(grossProfit.getText().toString());
                double result = value1 + value2;
            }
        });

    }
}
