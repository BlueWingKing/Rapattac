package crazie.com.example.jimmy.rapatac;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by jimmy on 2017-02-02.
 */

public class kids extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kids);
    }
    /*return to main button */
    protected void Main(View v) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);}

}
