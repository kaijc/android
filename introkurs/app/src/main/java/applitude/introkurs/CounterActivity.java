package applitude.introkurs;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CounterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //Det den skal gjore nor back er presset
    }

}
