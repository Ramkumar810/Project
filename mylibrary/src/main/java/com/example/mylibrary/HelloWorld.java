package com.example.mylibrary;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by kannas on 5/15/2017.
 */

public class HelloWorld extends AppCompatActivity{

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_hello);
    }
    public static void helloWorldFunction(){
       // Toast.makeText(this,"helloWorldFunction is executed",Toast.LENGTH_SHORT).show();
        Log.d("name","helloWorldFunction is executed");

    }
    public void helloFunction(){
        Log.d("HelloWorld","helloFunction"+"");
    }
    public void colorLayouts(){
        int i=10;
        int z=11;
        Log.d("colorLayouts",i+z+"");


    }
}
