package crazie.com.example.jimmy.rapatac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /* buttons for easy movement between diffrent parts of the application -Jimmy*/
    protected void Loggin (View v) {
        Intent intent = new Intent(this,Loggin.class);
        startActivity(intent);}

    protected void kids (View v) {
        Intent intent = new Intent(this,kids.class);
        startActivity(intent);}

    protected void Schema (View v) {
        Intent intent = new Intent(this,schema.class);
        startActivity(intent);}

}
