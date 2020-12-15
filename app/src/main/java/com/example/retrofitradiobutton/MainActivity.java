package com.example.retrofitradiobutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String dateUrl = "http://date.jsontest.com/";
    Button buttonResult;
    TextView textViewResult;
    RadioButton ipButton;
    RadioButton datetimeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResult = findViewById(R.id.textViewResult);
        ipButton = findViewById(R.id.radioButtonIp);;
        datetimeButton = findViewById(R.id.radioButtonDateTime);;

        buttonResult = findViewById(R.id.buttonResult);
        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ipButton.isChecked()) {
                    textViewResult.setText("Option1");
                    App.getApi().getIP("ip").enqueue(new Callback<List<IPadress>>() {
                        @Override
                        public void onResponse(Call<List<IPadress>> call, Response<List<IPadress>> response) {
                            textViewResult.setText("Option3");
                            //posts.addAll(response.body());
                            //recyclerView.getAdapter().notifyDataSetChanged();
                        }

                        @Override
                        public void onFailure(Call<List<IPadress>> call, Throwable t) {
                            Toast.makeText(MainActivity.this, "An error occurred during networking", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
                if (datetimeButton.isChecked())
                {
                    textViewResult.setText("Option2");
                }
            }
        });
    }
}