package com.example.pandukasamaranayake.emr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    private EditText nic;
    private EditText password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nic=(EditText)findViewById(R.id.nic);
        password=(EditText)findViewById(R.id.password);
        login=(Button)findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                validate(nic.getText().toString(),password.getText().toString());
            }
        });
    }

    public void validate(String nic,String password){
        if(nic.equals("94") && password.equals("123")){
            Intent intent=new Intent(Login.this,MainActivity.class);
            startActivity(intent);
            finish();
        }else{

        }
    }
}
