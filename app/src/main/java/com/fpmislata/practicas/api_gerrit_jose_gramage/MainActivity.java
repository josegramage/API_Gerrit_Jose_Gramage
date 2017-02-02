package com.fpmislata.practicas.api_gerrit_jose_gramage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Controller controller = new Controller();
        controller.start();
    }

}
