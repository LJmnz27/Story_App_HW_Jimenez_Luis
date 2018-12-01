package org.pursuit.story_app_hw_jimenez_luis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView secondActivityEdittext;
    public static final String SECOND_ACTIVITY_KEY = "input key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        secondActivityEdittext= findViewById(R.id.first_activity_edit_text);

        findViewById(R.id.second_activity_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String secondInput = secondActivityEdittext.getText().toString();

                if(TextUtils.isEmpty(secondInput)) {
                    secondActivityEdittext.setError("This field can't be left blank");
                    return;
                }
                Intent intent = new Intent(getApplicationContext(),ThirdActivity.class);
                startActivity(intent);
                intent.putExtra(SECOND_ACTIVITY_KEY, secondInput);
            }
        });
        }

}
