package com.ghuri.fruitsbenefit;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

  new Handler().postDelayed(new Runnable() {
      @Override
      public void run() {
          Intent intent = new Intent(MainActivity.this,fruitlist.class);
          startActivity(intent);
          finish();
      }
  },3000);



    }


}
