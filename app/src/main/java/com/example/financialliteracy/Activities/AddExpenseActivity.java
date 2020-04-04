package com.example.financialliteracy.Activities;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.financialliteracy.R;

public class AddExpenseActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_expense);
    }

    /*
        TODO:
        Insert expenses into the database
        Have fields for ID (primary key), date, category, name, dollar_value
     */
}
