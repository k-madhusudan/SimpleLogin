package com.ed.simplelogin;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);



        final Button login = (Button) findViewById(R.id.button5);
        Button reset = (Button) findViewById(R.id.button6);
        final EditText uname = (EditText) findViewById(R.id.editText);
        final EditText pwd = (EditText) findViewById(R.id.editText2);

        final RelativeLayout rel = (RelativeLayout) findViewById(R.id.activity_login_screen);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d("",uname.getText());
                if(uname.getText().toString().equals("Admin") && pwd.getText().toString().equals("Admin123")) {

                    Toast.makeText(getApplicationContext(),"Welcome Admin, your password is Admin123",Toast.LENGTH_LONG).show();

                    rel.setBackgroundColor(Color.GREEN);
                }
                else{
                    Toast.makeText(getApplicationContext(),"wrong username or password",Toast.LENGTH_LONG).show();
                    rel.setBackgroundColor(Color.RED);
                }
            }
        });
    }
}
