package io.google.stocksledger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class WelcomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
    }

    public void register(View view) {
        showRegister("");
    }

    public void login(View view) {
        showLogin("");
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void showLogin(String message) {
        displayToast(message);
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

    }

    public void showRegister(String message) {
        displayToast(message);
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);

    }
}
