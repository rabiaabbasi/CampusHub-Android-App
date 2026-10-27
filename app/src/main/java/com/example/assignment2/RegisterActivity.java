package com.example.assignment2;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText etName = findViewById(R.id.etName);
        EditText etEmail = findViewById(R.id.etEmail);
        EditText etPass = findViewById(R.id.etPassword);
        EditText etConfirm = findViewById(R.id.etConfirm);

        findViewById(R.id.btnRegister).setOnClickListener(v -> {
            String name = etName.getText().toString().trim();
            String email = etEmail.getText().toString().trim();
            String pass = etPass.getText().toString();
            String confirm = etConfirm.getText().toString();

            if (name.isEmpty()) { etName.setError(getString(R.string.err_empty)); return; }
            if (!Auth.isValidEmail(email)) { etEmail.setError(getString(R.string.err_email)); return; }
            if (pass.length() < 6) { etPass.setError(getString(R.string.err_pass_len)); return; }
            if (!pass.equals(confirm)) { etConfirm.setError(getString(R.string.err_match)); return; }

            Auth.name = name; Auth.email = email; Auth.password = pass;
            Toast.makeText(this, R.string.msg_registered, Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}