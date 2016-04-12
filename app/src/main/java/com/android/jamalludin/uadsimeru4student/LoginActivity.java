package com.android.jamalludin.uadsimeru4student;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by jamal on 12/04/16.
 */
public class LoginActivity extends Activity implements View.OnClickListener {

    Button login;
    EditText username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.nimText);
        password = (EditText) findViewById(R.id.passwordText);
        login = (Button) findViewById(R.id.loginbtn);

        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.loginbtn:

                String NIM = username.getText().toString();
                String Password = password.getText().toString();

                if (Password.equals("mhs")) {
                    Toast.makeText(getApplicationContext(), "Congrats: Login Successfull", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(this, MainActivity.class));
                }
                if (NIM.equals("") || Password.equals("")) {
                    Toast.makeText(getApplicationContext(), "Field Empty", Toast.LENGTH_LONG).show();
                    return;
                } else {
                    Toast.makeText(getApplicationContext(), "User Name or Password does not match", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
