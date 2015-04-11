package com.example.mahantesh.myapplication;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;


public class MainActivity2 extends ActionBarActivity {
    private FrameLayout die1,die2;
    private Button roll,hold;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent =getIntent();

        hold=(Button)findViewById(R.id.hold);
        hold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity2.this, MainActivity.class);
                intent.putExtra("Score",99);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

            }
        });
        die1=(FrameLayout)findViewById(R.id.die1);
        die2=(FrameLayout)findViewById(R.id.die2);
    }
    public void rollDice(){
        int val1=1+(int)(6*Math.random());
        int val2=1+(int)(6*Math.random());
        setDie(val1,die1);
        setDie(val2,die2);

    }
    public void setDie(int value , FrameLayout layout){
        Drawable pic=null;
        switch(value){
            case 1:
                pic=getResources().getDrawable(R.drawable.die_face_1);
                break;
            case 2:
                pic=getResources().getDrawable(R.drawable.die_face_2);
                break;
            case 3:
                pic=getResources().getDrawable(R.drawable.die_face_3);
                break;
            case 4:
                pic=getResources().getDrawable(R.drawable.die_face_4);
                break;
            case 5:
                pic=getResources().getDrawable(R.drawable.die_face_5);
                break;
            case 6:
                pic=getResources().getDrawable(R.drawable.die_face_6);
                break;
        }
        layout.setBackground(pic);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
