package com.suman.login;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends Activity {

        private EditText usernameEditText;
        private EditText passwordEditText;
        private Button signupButton;
        private Button  goToSignUpButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_log_in);

            usernameEditText = findViewById(R.id.username);
            passwordEditText = findViewById(R.id.password);
            signupButton = findViewById(R.id.login);
            goToSignUpButton = findViewById(R.id.signupgo);

            signupButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String username = usernameEditText.getText().toString();
                    String password = passwordEditText.getText().toString();

                    if (username.isEmpty() || password.isEmpty() ) {
                        Toast.makeText(LoginPage.this, "Please fill all fields", Toast.LENGTH_SHORT).show();}
                  else {
                        Log.d("SignUpScreen", "Username: " + username + ", Password: " + password);
                        Toast.makeText(LoginPage.this, "Signup successful", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            goToSignUpButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(LoginPage.this, SignUpScreen.class);
                    startActivity(intent);
                }
            });




        }
    }

