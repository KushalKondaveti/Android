package com.example.my_login_page_12;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText et_username = findViewById(R.id.username);
        EditText et_password = findViewById(R.id.password);
        Button login = findViewById(R.id.login_button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = et_username.getText().toString();
                String password= et_password.getText().toString();

                if(user.equals("admin")&&password.equals("1234")){
                    Intent intent = new Intent(MainActivity.this, Welcome_Activity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this,"Invalid Credentials",Toast.LENGTH_SHORT).show();
                }

            }
        });

};
}