package com.example.student.myapplication;

import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn,btnorder;
    RatingBar rate;
    CheckBox pizza,drinks,hot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.button4);
       rate=(RatingBar) findViewById(R.id.ratingBar4);
       pizza=(CheckBox) findViewById (R.id.checkBox);
        drinks=(CheckBox) findViewById (R.id.checkBox2);
        hot=(CheckBox) findViewById (R.id.checkBox3);
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String str =String.valueOf(rate.getRating());
               Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();
               public void onClick(View View); {
                   int totalamount=0;
                   StringBuilder result=new StringBuilder();
                   result.append("Selected Items:");
                   if(pizza.isChecked()){
                       result.append("\nPizza 100Rs");
                       totalamount+=100;
                   }
                   if(drinks.isChecked()){
                       result.append("\nDrinks 50Rs");
                       totalamount+=50;
                   }
                   if(hot.isChecked()){
                       result.append("\nHot 120Rs");
                       totalamount+=120;
                   }
                   result.append("\nTotal: "+totalamount+"Rs");
                   //Displaying the message on the toast
                   Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();

               }
       });
}
