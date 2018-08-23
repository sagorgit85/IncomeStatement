package com.project.sagor.incomestatement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GrossProfitActivity extends AppCompatActivity {

    EditText netSales, costOfGoodsSold;
    Button clearBtn, submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gross_profit);

        netSales        = findViewById(R.id.netSalesET);
        costOfGoodsSold = findViewById(R.id.costOfGoodsSoldET);

        clearBtn        = findViewById(R.id.clearBtn);
        submitBtn       = findViewById(R.id.submitBtn);

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                netSales.setText("");
                costOfGoodsSold.setText("");
            }
        });

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double value1 = Double.valueOf(netSales.getText().toString());
                double value2 = Double.valueOf(costOfGoodsSold.getText().toString());
                double result = value1 - value2;
            }
        });

    }
}
