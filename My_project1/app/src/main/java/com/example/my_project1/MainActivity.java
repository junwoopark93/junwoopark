package com.example.my_project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;

import android.util.Log;

import android.view.View;

import android.widget.Button;

import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    final int main_menu = 9;
    Button[] menu_select_button = new Button[main_menu];
    final int[] buttonID = {R.id.bt1, R.id.bt2, R.id.bt3, R.id.bt4, R.id.bt5, R.id.bt6, R.id.bt7, R.id.bt8, R.id.bt9};

    class Menu{
        private String[] sub_menu;
        private int[] sub_menu_price;
        private int[] sub_menu_count;

        public void setSub_menu(String[] sub_menu){
            this.sub_menu = sub_menu;
        }

        public void setSub_menu_price(int[] sub_menu_price){
            this.sub_menu_price = sub_menu_price;
        }

        public void setSub_menu_count(int[] sub_menu_count){
            this.sub_menu_count = sub_menu_count;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Hustar 점심 메뉴 선정");

        //각 버튼에  ClickListener 정의하기.
        for (int i = 0; i < main_menu ; i++) {
            final int idx = i;
            menu_select_button[i] = (Button) findViewById(buttonID[i]);
            menu_select_button[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), page2.class);

                    intent.putExtra("sub_menu1_pass", sub_menu[idx][0]);
                    intent.putExtra("sub_menu2_pass", sub_menu[idx][1]);
                    intent.putExtra("sub_menu3_pass", sub_menu[idx][2]);
                    intent.putExtra("sub_menu4_pass", sub_menu[idx][3]);
                    intent.putExtra("sub_menu5_pass", sub_menu[idx][4]);
                    intent.putExtra("sub_menu6_pass", sub_menu[idx][5]);
                    intent.putExtra("sub_menu7_pass", sub_menu[idx][6]);
                    intent.putExtra("sub_menu8_pass", sub_menu[idx][7]);
                    intent.putExtra("sub_menu9_pass", sub_menu[idx][8]);

                    intent.putExtra("sub_menu1_pass_price", sub_menu_price[idx][0]);
                    intent.putExtra("sub_menu2_pass_price", sub_menu_price[idx][1]);
                    intent.putExtra("sub_menu3_pass_price", sub_menu_price[idx][2]);
                    intent.putExtra("sub_menu4_pass_price", sub_menu_price[idx][3]);
                    intent.putExtra("sub_menu5_pass_price", sub_menu_price[idx][4]);
                    intent.putExtra("sub_menu6_pass_price", sub_menu_price[idx][5]);
                    intent.putExtra("sub_menu7_pass_price", sub_menu_price[idx][6]);
                    intent.putExtra("sub_menu8_pass_price", sub_menu_price[idx][7]);
                    intent.putExtra("sub_menu9_pass_price", sub_menu_price[idx][8]);

                    startActivity(intent);//액티비티 띄우기
                }
            });
        }

    }
}