package com.example.assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class ResetPasswordActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        EditText etNew = findViewById(R.id.etNew);
        EditText etConfirm = findViewById(R.id.etConfirm);

        findViewById(R.id.btnReset).setOnClickListener(v -> {
            String p = etNew.getText().toString();
            String c = etConfirm.getText().toString();
            if (p.length() < 6) { etNew.setError(getString(R.string.err_pass_len)); return; }
            if (!p.equals(c)) { etConfirm.setError(getString(R.string.err_match)); return; }

            Auth.password = p;
            Toast.makeText(this, R.string.msg_reset_ok, Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, LoginActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(i);
            finish();
        });
    }
}