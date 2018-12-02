package com.waytojava.recyclerviewkotlinmvvm;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.waytojava.recyclerviewkotlinmvvm.databinding.ActivityMainBinding;

/**
 * Created by Manish Kumar on 11/30/2018
 */
public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        Employee employee = new Employee(1001, "Manish Kumar", "javatech147@gmail.com");
        binding.setEmployee(employee);
    }
}
