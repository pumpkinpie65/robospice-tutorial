package com.sliceofandroid.robospicetutorial;

import com.sliceofandroid.robospicetutorial.R;
import android.app.Activity;
import android.os.Bundle;

public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

    }

}
