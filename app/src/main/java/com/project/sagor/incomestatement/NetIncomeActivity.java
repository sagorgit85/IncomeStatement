package com.project.sagor.incomestatement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NetIncomeActivity extends AppCompatActivity {

    EditText grossProfit, operatingExpenses;
    Button clearBtn, submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_net_income);

        // Back button enabled display.................
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        grossProfit         = findViewById(R.id.grossProfitET);
        operatingExpenses   = findViewById(R.id.operatingExpensesET);

        clearBtn            = findViewById(R.id.clearBtn);
        submitBtn           = findViewById(R.id.submitBtn);

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grossProfit.setText("");
                operatingExpenses.setText("");
            }
        });

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NetIncomeActivity.this, ShowResultActivity.class);
                double value1 = Double.valueOf(grossProfit.getText().toString());
                double value2 = Double.valueOf(operatingExpenses.getText().toString());
                double result = value1 - value2;
                intent.putExtra("result", result);
                intent.putExtra("value1", value1);
                intent.putExtra("value2", value2);
                intent.putExtra("name1","Gross Profit");
                intent.putExtra("name2","Operating Expenses");
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
