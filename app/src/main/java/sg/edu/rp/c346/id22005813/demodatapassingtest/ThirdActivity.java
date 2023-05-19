package sg.edu.rp.c346.id22005813.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
public class ThirdActivity extends AppCompatActivity {

    TextView tvAnswerChar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        //Step 2
        tvAnswerChar = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        char value = intentReceived.getCharExtra("value", 'k');
        tvAnswerChar.setText("Character value received is: " + value);
    }
}