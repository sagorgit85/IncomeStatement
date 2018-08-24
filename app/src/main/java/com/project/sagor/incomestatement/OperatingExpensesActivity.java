package com.project.sagor.incomestatement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
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

        // Back button enabled display.................
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

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
                Intent intent = new Intent(OperatingExpensesActivity.this, ShowResultActivity.class);
                double value1 = Double.valueOf(grossProfit.getText().toString());
                double value2 = Double.valueOf(netIncomes.getText().toString());
                double result = value1 - value2;
                intent.putExtra("result", result);
                intent.putExtra("value1", value1);
                intent.putExtra("value2", value2);
                intent.putExtra("name1","Gross Profit");
                intent.putExtra("name2","Net Income");
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
