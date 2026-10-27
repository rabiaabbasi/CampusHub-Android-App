package com.example.assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class ForgotPasswordActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        EditText etEmail = findViewById(R.id.etEmail);

        findViewById(R.id.btnSend).setOnClickListener(v -> {
            String email = etEmail.getText().toString().trim();
            if (!Auth.isValidEmail(email)) { etEmail.setError(getString(R.string.err_email)); return; }
            if (!email.equalsIgnoreCase(Auth.email)) {
                etEmail.setError(getString(R.string.err_not_found)); return;
            }
            Toast.makeText(this, R.string.msg_reset_sent, Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, ResetPasswordActivity.class);
            i.putExtra("email", email);
            startActivity(i);
            finish();
        });
    }
}