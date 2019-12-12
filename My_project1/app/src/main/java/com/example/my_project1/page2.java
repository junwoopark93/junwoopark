package com.example.my_project1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);


        TextView tx1 = (TextView)findViewById(R.id.sub_menu1);
        TextView tx2 = (TextView)findViewById(R.id.sub_menu2);
        TextView tx3 = (TextView)findViewById(R.id.sub_menu3);
        TextView tx4 = (TextView)findViewById(R.id.sub_menu4);
        TextView tx5 = (TextView)findViewById(R.id.sub_menu5);
        TextView tx6 = (TextView)findViewById(R.id.sub_menu6);
        TextView tx7 = (TextView)findViewById(R.id.sub_menu7);
        TextView tx8 = (TextView)findViewById(R.id.sub_menu8);
        TextView tx9 = (TextView)findViewById(R.id.sub_menu9);

        TextView tx1_price = (TextView)findViewById(R.id.sub_menu1_price);
        TextView tx2_price = (TextView)findViewById(R.id.sub_menu2_price);
        TextView tx3_price = (TextView)findViewById(R.id.sub_menu3_price);
        TextView tx4_price = (TextView)findViewById(R.id.sub_menu4_price);
        TextView tx5_price = (TextView)findViewById(R.id.sub_menu5_price);
        TextView tx6_price = (TextView)findViewById(R.id.sub_menu6_price);
        TextView tx7_price = (TextView)findViewById(R.id.sub_menu7_price);
        TextView tx8_price = (TextView)findViewById(R.id.sub_menu8_price);
        TextView tx9_price = (TextView)findViewById(R.id.sub_menu9_price);

        Intent intentget = getIntent(); /*데이터 수신*/

        String name1 = intentget.getStringExtra("sub_menu1_pass");
        String name2 = intentget.getStringExtra("sub_menu2_pass");
        String name3 = intentget.getStringExtra("sub_menu3_pass");
        String name4 = intentget.getStringExtra("sub_menu4_pass");
        String name5 = intentget.getStringExtra("sub_menu5_pass");
        String name6 = intentget.getStringExtra("sub_menu6_pass");
        String name7 = intentget.getStringExtra("sub_menu7_pass");
        String name8 = intentget.getStringExtra("sub_menu8_pass");
        String name9 = intentget.getStringExtra("sub_menu9_pass");

        String name1_price = intentget.getStringExtra("sub_menu1_pass_price");
        String name2_price = intentget.getStringExtra("sub_menu2_pass_price");
        String name3_price = intentget.getStringExtra("sub_menu3_pass_price");
        String name4_price = intentget.getStringExtra("sub_menu4_pass_price");
        String name5_price = intentget.getStringExtra("sub_menu5_pass_price");
        String name6_price = intentget.getStringExtra("sub_menu6_pass_price");
        String name7_price = intentget.getStringExtra("sub_menu7_pass_price");
        String name8_price = intentget.getStringExtra("sub_menu8_pass_price");
        String name9_price = intentget.getStringExtra("sub_menu9_pass_price");

        tx1.setText(name1);
        tx2.setText(name2);
        tx3.setText(name3);
        tx4.setText(name4);
        tx5.setText(name5);
        tx6.setText(name6);
        tx7.setText(name7);
        tx8.setText(name8);
        tx9.setText(name9);

        tx1.setText(name1_price);
        tx2.setText(name2_price);
        tx3.setText(name3_price);
        tx4.setText(name4_price);
        tx5.setText(name5_price);
        tx6.setText(name6_price);
        tx7.setText(name7_price);
        tx8.setText(name8_price);
        tx9.setText(name9_price);
    }

}
