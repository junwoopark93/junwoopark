package com.example.my_project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;

import android.util.Log;

import android.view.Menu;
import android.view.View;

import android.widget.Button;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final String[] main_menu = {"menu1","menu2","menu3","menu4","menu5","menu6","menu7","menu8","menu9"};

    private String[][] sub_menu = new String[9][9];
    private int[][] sub_menu_price = new int[9][9];
    private int[][] sub_menu_count = new int[9][9];
    private int selected_menu = 0;

    final int[] buttonID = {R.id.bt1, R.id.bt2, R.id.bt3, R.id.bt4, R.id.bt5, R.id.bt6, R.id.bt7, R.id.bt8, R.id.bt9};
    Button[] menu_select_button = new Button[main_menu.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Hustar 점심 메뉴 선정");

        //각 버튼에  ClickListener 정의하기.
        for (int i = 0; i < main_menu.length ; i++) {
            final int idx = i;
            menu_select_button[idx] = (Button) findViewById(buttonID[idx]);
            menu_select_button[idx].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent send_intent = new Intent(MainActivity.this, page2.class);
                    send_intent.putExtra("main_menu",idx);
                    startActivity(send_intent);//액티비티 띄우기
                }
            });
        }

    }
}