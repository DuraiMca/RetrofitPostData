package com.durai.admin.retrofitpostdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    EditText Name, Age, Degree;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = (EditText) findViewById(R.id.name);
        Age = (EditText) findViewById(R.id.age);
        Degree = (EditText) findViewById(R.id.degree);
        save = (Button) findViewById(R.id.submit);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name = Name.getText().toString();
                final int age = Integer.parseInt(Age.getText().toString());
                final String degree = Degree.getText().toString();
                Retrofit retrofit = new Retrofit.Builder().baseUrl("http://10.0.2.2/Register/").addConverterFactory(GsonConverterFactory.create()).build();
                dataapi api = retrofit.create(dataapi.class);
                ModelData modelData = new ModelData(name, age, degree);
                Call<ModelData> modelCall=api.data(name,age,degree);

                modelCall.enqueue(new Callback<ModelData>() {
                    @Override
                    public void onResponse(Call<ModelData> call, Response<ModelData> response) {

                    }

                    @Override
                    public void onFailure(Call<ModelData> call, Throwable t) {

                    }
                });




            }


        });
    }
}

