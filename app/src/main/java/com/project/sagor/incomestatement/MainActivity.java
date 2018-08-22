package com.project.sagor.incomestatement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    CardView netSales, costOfGoodsSold, grossProfit, operatingExpences, netIncome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        netSales            = findViewById(R.id.salesCardViewId);
        costOfGoodsSold     = findViewById(R.id.costOfGoodsSoldCardViewId);
        grossProfit         = findViewById(R.id.grossProfitCardViewId);
        operatingExpences   = findViewById(R.id.operatingExpensesCardViewId);
        netIncome           = findViewById(R.id.netIncomeCardViewId);

        netSales.setOnClickListener(this);
        costOfGoodsSold.setOnClickListener(this);
        grossProfit.setOnClickListener(this);
        operatingExpences.setOnClickListener(this);
        netIncome.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.salesCardViewId){

            Intent intent = new Intent(this, NetSalesActivity.class);
            startActivity(intent);

        }else if (view.getId() == R.id.costOfGoodsSoldCardViewId){

            Intent intent = new Intent(this, CostOfGoodsSoldActivity.class);
            startActivity(intent);

        }else if(view.getId() == R.id.grossProfitCardViewId){

            Intent intent = new Intent(this, GrossProfitActivity.class);
            startActivity(intent);

        }else if(view.getId() == R.id.operatingExpensesCardViewId){

            Intent intent = new Intent(this, OperatingExpensesActivity.class);
            startActivity(intent);

        }else if(view.getId() == R.id.netIncomeCardViewId){

            Intent intent = new Intent(this, NetIncomeActivity.class);
            startActivity(intent);

        }

    }
}
