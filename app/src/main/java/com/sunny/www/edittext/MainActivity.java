package com.sunny.www.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText plainText = ((EditText) findViewById(R.id.plainText));
        plainText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((event.getAction()==KeyEvent.ACTION_DOWN)&&
                        (keyCode==KeyEvent.KEYCODE_ENTER)){
                    Toast.makeText(v.getContext(),text,Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }
        });
    }

}
