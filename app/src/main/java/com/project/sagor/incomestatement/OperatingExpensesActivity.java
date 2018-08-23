package com.project.sagor.incomestatement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OperatingExpensesActivity extends AppCompatActivity {

    EditText netIncomes, grossProfit;
    Button clearBtn, submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operating_expenses);

        netIncomes  = findViewById(R.id.netIncomeET);
        grossProfit = findViewById(R.id.grossProfitET);

        clearBtn    = findViewById(R.id.clearBtn);
        submitBtn   = findViewById(R.id.submitBtn);

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                netIncomes.setText("");
                grossProfit.setText("");
            }
        });

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double value1 = Double.valueOf(netIncomes.getText().toString());
                double value2 = Double.valueOf(grossProfit.getText().toString());
                double result = value1 + value2;
            }
        });

    }
}
