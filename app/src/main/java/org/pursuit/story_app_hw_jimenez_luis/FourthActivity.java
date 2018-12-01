package org.pursuit.story_app_hw_jimenez_luis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class FourthActivity extends AppCompatActivity {
    private EditText fourthActivityEditText;
    public static final String FOURTH_ACTIVITY_KEY = "input key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        findViewById(R.id.third_activity_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String thirdInput =  fourthActivityEditText.getText().toString();
                if(TextUtils.isEmpty(thirdInput)) {
                    fourthActivityEditText.setError("This field can't be left blank");
                    return;
                }
                Intent intent = new Intent(v.getContext(),FifthActivity.class);
                startActivity(intent);
                intent.putExtra(FOURTH_ACTIVITY_KEY, thirdInput);
            }
        });
    }
}
