package kent.gimenez.com.swoosh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    private static final String KEY_SENT_TEXT = "ds";
    private Button MensButton;
    private Button WomenButton;
    private Button CoedButton;
    private Button ButtonNext;

    private String leagueText;
    private TextView Result;
    private TextView TextAbove;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        MensButton = (Button) findViewById(R.id.tvMens);
        WomenButton = (Button) findViewById(R.id.tvWomens);
        CoedButton = (Button) findViewById(R.id.tvCoed);
        ButtonNext = (Button) findViewById(R.id.btnNext);
        Result = (TextView) findViewById(R.id.tvResult);
        TextAbove = (TextView) findViewById(R.id.tvImAtext);

        ButtonNext.setEnabled(false);
    }

    public void ButtonMens(View view) {

            setLeagueText(getResources().getString(R.string.text_mens));

        MensButton.setAlpha(.99f);
            CoedButton.setAlpha(.50f);
            WomenButton.setAlpha(.50f);
            ButtonNext.setAlpha(.99f);

            ButtonNext.setEnabled(true);
    }

    public void ButtonWomens(View view) {

        setLeagueText(getResources().getString(R.string.text_womens));

        WomenButton.setAlpha(.99f);
        CoedButton.setAlpha(.50f);
        MensButton.setAlpha(.50f);
        ButtonNext.setAlpha(.99f);

        ButtonNext.setVisibility(View.VISIBLE);
        ButtonNext.setEnabled(true);

    }


    public void ButtonCoed(View view) {


        setLeagueText(getResources().getString(R.string.text_co_ed));


        CoedButton.setAlpha(.99f);
        WomenButton.setAlpha(.50f);
        MensButton.setAlpha(.50f);
        ButtonNext.setAlpha(.99f);

        ButtonNext.setVisibility(View.VISIBLE);
        ButtonNext.setEnabled(true);
    }

    public void Next(View view) {

        Intent intent1 = new Intent(this,ThirdActivity.class);
        startActivityForResult(intent1,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            if (requestCode == 1) {

                String replyMsg = data.getStringExtra(ThirdActivity.KEY_REPLY_TEXT);

                if (this.getLeagueText().equalsIgnoreCase("Mens")) {

                    MensButton.setEnabled(false);
                    CoedButton.setEnabled(false);
                    WomenButton.setEnabled(false);
                    ButtonNext.setVisibility(View.INVISIBLE);
                    Result.setText(replyMsg);
                    Result.setVisibility(View.VISIBLE);
                    TextAbove.setVisibility(View.VISIBLE);
                } else if (this.getLeagueText().equalsIgnoreCase("Womens")) {
                    WomenButton.setEnabled(false);
                    CoedButton.setEnabled(false);
                    MensButton.setEnabled(false);
                    ButtonNext.setVisibility(View.INVISIBLE);
                    Result.setText(replyMsg);
                    Result.setVisibility(View.VISIBLE);
                    TextAbove.setVisibility(View.VISIBLE);

                } else if (this.getLeagueText().equalsIgnoreCase("Co-ed")) {
                    CoedButton.setEnabled(false);
                    WomenButton.setEnabled(false);
                    MensButton.setEnabled(false);
                    ButtonNext.setVisibility(View.INVISIBLE);
                    Result.setText(replyMsg);
                    Result.setVisibility(View.VISIBLE);
                    TextAbove.setVisibility(View.VISIBLE);

                }


            }


        }


    }

    public void setLeagueText(String leagueText) {
        this.leagueText = leagueText;
    }

    public String getLeagueText() {
        return leagueText;
    }
}




