package com.test.dieman.randomtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by AnSingh on 5/1/2015.
 */
public class LockScreenActivity extends Activity {
    Button unlockbtn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lockscreen);
        startService(new Intent(this,LockScreenService.class));
        unlockbtn=(Button)findViewById(R.id.unlock_btn);
        unlockbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
