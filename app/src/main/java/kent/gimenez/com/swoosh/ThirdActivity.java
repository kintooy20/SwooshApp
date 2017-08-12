package kent.gimenez.com.swoosh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ThirdActivity extends AppCompatActivity {
    public static final String KEY_REPLY_TEXT = "asdasd";
    private Button ButtonBeginner;
    private Button ButtonBaller;
    private Button ButtonFinish;
    private String iAmText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        ButtonBeginner = (Button) findViewById(R.id.btnBeginner);
        ButtonBaller = (Button) findViewById(R.id.btnBaller);
        ButtonFinish = (Button) findViewById(R.id.btnFinish);




    }



    public void Beginner(View view) {

        ButtonBeginner.setAlpha(.99f);
        ButtonBaller.setAlpha(.50f);
        ButtonFinish.setAlpha(.99f);

        ButtonFinish.setVisibility(View.VISIBLE);
        setIamText ("Beginner");

    }

    public void Baller(View view) {

        ButtonBaller.setAlpha(.99f);
        ButtonBeginner.setAlpha(.50f);
        ButtonFinish.setAlpha(.99f);

        ButtonFinish.setVisibility(View.VISIBLE);
        setIamText("Baller");

    }


    public void Finish(View view) {


    Intent intent = new Intent();
        intent.putExtra(KEY_REPLY_TEXT , this.getiAmText());
    setResult(Activity.RESULT_OK,intent);

        finish();




    }

    public void setIamText(String iamText) {
        this.iAmText = iamText;
    }

    public String getiAmText() {
        return iAmText;
    }
}


