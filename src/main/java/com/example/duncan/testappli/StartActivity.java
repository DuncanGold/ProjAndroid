package com.example.duncan.testappli;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.optionsmenu);
    }

    public void startQuiz(View view) {

        int quizCategory=1;
        // on determine la difficulté du jeu
        switch (view.getId()) {
            case R.id.btnsimple:
                quizCategory = 1;
                break;
            case R.id.btnintermediate:
                quizCategory = 2;
                break;
            case R.id.btnhard:
                quizCategory = 3;
                break;

        }

        Intent appel = new Intent(getApplicationContext(), MainActivity.class);
        appel.putExtra("quizcategory",quizCategory);
        startActivity(appel);
    }

}




