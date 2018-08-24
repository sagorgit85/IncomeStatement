package com.project.sagor.incomestatement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CostOfGoodsSoldActivity extends AppCompatActivity {

    EditText netSales, grossProfit;
    Button clearBtn, submitBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cost_of_goods_sold);

        // Back button enabled display.................
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        netSales    = findViewById(R.id.netSalesET);
        grossProfit = findViewById(R.id.grossProfitET);

        clearBtn    = findViewById(R.id.clearBtn);
        submitBtn   = findViewById(R.id.submitBtn);

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                netSales.setText("");
                grossProfit.setText("");
            }
        });

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CostOfGoodsSoldActivity.this, ShowResultActivity.class);
                double value1 = Double.valueOf(netSales.getText().toString());
                double value2 = Double.valueOf(grossProfit.getText().toString());
                double result = value1 - value2;
                intent.putExtra("result", result);
                intent.putExtra("value1", value1);
                intent.putExtra("value2", value2);
                intent.putExtra("name1","Net Sales");
                intent.putExtra("name2","Gross Profit");
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
