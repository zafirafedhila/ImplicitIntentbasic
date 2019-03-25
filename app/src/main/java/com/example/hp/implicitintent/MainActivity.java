package com.example.hp.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dosomething(View view) {

        switch (view.getId()) {
            case R.id.button:
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ijzbxQJUDTY"));
                startActivity(i1);
                break;
            case R.id.button2:
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:081262313042"));
                startActivity(i2);
                break;
            case R.id.button5:
                Intent i3 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 2.888180 ,107.926941"));
                startActivity(i3);
                break;
        }
    }
}
