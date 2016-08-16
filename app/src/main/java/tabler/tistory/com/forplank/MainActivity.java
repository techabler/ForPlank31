package tabler.tistory.com.forplank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView vw_imgPlay;
    private TextView vw_txtDay;
    private TextView vw_txtTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vw_txtDay = (TextView) findViewById(R.id.vw_txtDay);
        vw_imgPlay = (ImageView) findViewById(R.id.vw_imgPlay);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.vw_imgPlay){
            Toast.makeText(this,"TEST",Toast.LENGTH_LONG).show();
        }
    }
}
