package cn.edu.swufe.dpsquery;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.net.URL;

public class DQActivity extends AppCompatActivity implements Runnable{

    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dq);

        Thread t=new Thread(this);
        t.start();

        handler=new Handler(){

            @Override
            public void handleMessage(Message msg){

            }

        };
    }

    public void openOne(View btn){
        Intent dps=new Intent(this,JobActivity.class);
        startActivity(dps);
    }

    public void openTwo(View btn){
        Intent tank=new Intent(this,Job2Activity.class);
        startActivity(tank);
    }

    public void openThree(View btn){
        Intent heal=new Intent(this,Job3Activity.class);
        startActivity(heal);
    }

    public void run(){

    }

    Message msg=handler.obtainMessage();





}
