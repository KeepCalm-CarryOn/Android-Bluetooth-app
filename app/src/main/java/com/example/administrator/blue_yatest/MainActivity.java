package com.example.administrator.blue_yatest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
//import android.content.Intent;
//import android.view.Menu;
//import android.view.View;
//import android.widget.ArrayAdapter;
//import  android.widget.ListAdapter;
  import  android.widget.ListView;
  import android.widget.Button;

import java.util.Set;   //包含了Set集合的方法
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button On,Off,Connect,Disconnect,Search,Sendapdu;
    private BluetoothAdapter BA;
    private Set<BluetoothDevice> pairedDevices;
    private ListView lv;


    @Override  //伪代码，表示重写
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        On  = (Button)findViewById(R.id.button1);
        Off = (Button)findViewById(R.id.button2);
        Connect = (Button)findViewById(R.id.button3);
    }
}
