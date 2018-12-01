package org.pursuit.story_app_hw_jimenez_luis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class FifthActivity extends AppCompatActivity {
    private EditText fifthActivityEditText;
    public static final String FIFTH_ACTIVITY_KEY = "input key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        findViewById(R.id.third_activity_button).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String thirdInput =  fifthActivityEditText.getText().toString();
                if(TextUtils.isEmpty(thirdInput)) {
                    fifthActivityEditText.setError("This field can't be left blank");
                    return;
                }
                Intent intent = new Intent(v.getContext(),SixthActivity.class);
                startActivity(intent);
                intent.putExtra(FIFTH_ACTIVITY_KEY, thirdInput);
            }
        });

    }
}
