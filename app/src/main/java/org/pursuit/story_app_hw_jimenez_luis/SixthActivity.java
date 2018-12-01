package org.pursuit.story_app_hw_jimenez_luis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class SixthActivity extends AppCompatActivity {
    private EditText SixthActivityEditText;
    public static final String Sixth_ACTIVITY_KEY = "input key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
    }
}
