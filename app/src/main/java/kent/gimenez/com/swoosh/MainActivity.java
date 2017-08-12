package kent.gimenez.com.swoosh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button BtnGetstarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnGetstarted = (Button) findViewById(R.id.button2);
    }

    public void GetStarted (View view){


        BtnGetstarted.setAlpha(.99f);
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity (intent);


    }

}
