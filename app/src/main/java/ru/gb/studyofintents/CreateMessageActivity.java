package ru.gb.studyofintents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etMessage;
    private Button etButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);

        etMessage = findViewById(R.id.write_message);
        etButton = findViewById(R.id.send_message);

        etButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}