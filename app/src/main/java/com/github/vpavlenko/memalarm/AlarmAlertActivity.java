package com.github.vpavlenko.memalarm;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class AlarmAlertActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_alert);
    }

    public void startQuiz(View view) {
        Intent intent = new Intent(this, AlarmQuizActivity.class);
        startActivity(intent);
    }
}
