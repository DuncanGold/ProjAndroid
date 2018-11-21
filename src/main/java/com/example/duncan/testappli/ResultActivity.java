package com.example.duncan.testappli;

        import android.app.Activity;
        import android.content.Context;
        import android.content.SharedPreferences;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.widget.TextView;

public class ResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView textresult = (TextView) findViewById(R.id.textResult);
        TextView scoreTotal = (TextView) findViewById(R.id.scoretotal);

        int score = getIntent().getIntExtra("rightanswercount",0);
        textresult.setText(score + " / 5");
            SharedPreferences settings = getSharedPreferences("testappli", Context.MODE_PRIVATE);
            int totalScore = settings.getInt("totalScore",0);
            totalScore += score;

            textresult.setText("Nombre de bonnes réponses : "+ score + " /5");
            scoreTotal.setText("Score Total : " + totalScore);
            SharedPreferences.Editor editor = settings.edit();
            editor.putInt("totalScore", totalScore);
            editor.commit();
    }
}