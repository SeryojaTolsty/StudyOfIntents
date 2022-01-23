package ru.gb.studyofintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText messageView;
    private Button messageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);

        messageView = findViewById(R.id.write_message);
        messageButton = findViewById(R.id.send_message);

        messageButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, RecieveMessageActivity.class);
        String messageText = messageView.getText().toString();   //объявление новой переменной и перевод перевод внесённых пользователем значений в строку
        intent.putExtra(RecieveMessageActivity.EXTRA_MESSAGE, messageText);  //отправка данных (указание класса получателя с указанием константы, по которой он примет данные, что отправлять(новоявленная переменная))
        startActivity(intent);
    }
}