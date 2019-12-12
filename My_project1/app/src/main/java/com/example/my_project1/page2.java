package com.example.my_project1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class page2 extends AppCompatActivity {

    private RadioGroup radioGroup;
    private int selected_sub_menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);



        //텍스트 뷰 선언하기
        TextView tx1 = (TextView) findViewById(R.id.sub_menu1);
        TextView tx2 = (TextView) findViewById(R.id.sub_menu2);
        TextView tx3 = (TextView) findViewById(R.id.sub_menu3);
        TextView tx4 = (TextView) findViewById(R.id.sub_menu4);
        TextView tx5 = (TextView) findViewById(R.id.sub_menu5);
        TextView tx6 = (TextView) findViewById(R.id.sub_menu6);
        TextView tx7 = (TextView) findViewById(R.id.sub_menu7);
        TextView tx8 = (TextView) findViewById(R.id.sub_menu8);
        TextView tx9 = (TextView) findViewById(R.id.sub_menu9);

        TextView tx1_price = (TextView) findViewById(R.id.sub_menu1_price);
        TextView tx2_price = (TextView) findViewById(R.id.sub_menu2_price);
        TextView tx3_price = (TextView) findViewById(R.id.sub_menu3_price);
        TextView tx4_price = (TextView) findViewById(R.id.sub_menu4_price);
        TextView tx5_price = (TextView) findViewById(R.id.sub_menu5_price);
        TextView tx6_price = (TextView) findViewById(R.id.sub_menu6_price);
        TextView tx7_price = (TextView) findViewById(R.id.sub_menu7_price);
        TextView tx8_price = (TextView) findViewById(R.id.sub_menu8_price);
        TextView tx9_price = (TextView) findViewById(R.id.sub_menu9_price);

        TextView menu_text = (TextView) findViewById(R.id.main_menu);


        Intent get_intent = getIntent(); /*데이터 수신*/
        int main_menu_number = get_intent.getIntExtra("main_menu",0 );
         menu_text.setText("메뉴선정 : " + Integer.toString(main_menu_number + 1));

        Log.v("page2", "메뉴선정 : " + Integer.toString(main_menu_number));


        //라디오 버튼 설정
        final RadioGroup rg = (RadioGroup)findViewById(R.id.radioGroup);
        Button result = (Button)findViewById(R.id.result_button);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int id = rg.getCheckedRadioButtonId();
                //getCheckedRadioButtonId() 의 리턴값은 선택된 RadioButton 의 id 값.
                RadioButton rb = (RadioButton) findViewById(id);
                selected_sub_menu = Integer.parseInt(rb.getText().toString());

                Log.v("page2", "세부메뉴선택 : " + Integer.toString(selected_sub_menu));

                Intent page2_send_intent = new Intent(page2.this, MainActivity.class);
                send_intent.putExtra("main_menu",idx);
                startActivity(send_intent);//액티비티 띄우기
            }
        });

    }

}
