package applitude.introkurs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button forste_knapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){

        forste_knapp = (Button)findViewById(R.id.forste_knapp);
        forste_knapp.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, CounterActivity.class);
                startActivity(i);

            }

        });

    }
}
