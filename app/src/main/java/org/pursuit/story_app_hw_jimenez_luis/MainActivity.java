package org.pursuit.story_app_hw_jimenez_luis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText firstActivityEdittext;
    public static final String FIRST_ACTIVITY_KEY = "input key";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstActivityEdittext = findViewById(R.id.first_activity_edit_text);


        findViewById(R.id.first_activity_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = firstActivityEdittext.getText().toString();

                if(TextUtils.isEmpty(input)) {
                    firstActivityEdittext.setError("This field can't be left blank");
                    return;
                }
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra(FIRST_ACTIVITY_KEY, input);
                startActivity(intent);
            }
        });
    }
}
