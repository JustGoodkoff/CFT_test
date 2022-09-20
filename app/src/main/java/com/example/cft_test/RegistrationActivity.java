package com.example.cft_test;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Button confirmRegistration = findViewById(R.id.confirmButton);
        TextView name = findViewById(R.id.name);
        TextView surname = findViewById(R.id.surname);
        TextView date = findViewById(R.id.date);
        TextView password = findViewById(R.id.password);
        TextView confirmPassword = findViewById(R.id.confirmPassword);
        User user = new User();
        confirmRegistration.setOnClickListener(view -> {
            createUser(user, name, surname, date, password, confirmPassword);
            String response = user.checkValidateData(user.getName(), user.getSurname(),
                    user.getDate(), user.getPassword(), user.getconfirmPassword());

            if (response.equals("OK")) {
                Intent intent = new Intent(RegistrationActivity.this,
                        MainActivity.class);
                intent.putExtra("name", user.getName());
                startActivity(intent);
            } else {
                Toast.makeText(RegistrationActivity.this,
                        response, Toast.LENGTH_LONG).show();
            }
        });
    }

    private void createUser(User user, TextView name, TextView surname, TextView date,
                            TextView password, TextView confirmPassword) {
        user.setName(name.getText().toString());
        user.setSurname(surname.getText().toString());
        user.setDate(date.getText().toString());
        user.setPassword(password.getText().toString());
        user.setconfirmPassword(confirmPassword.getText().toString());
    }
}