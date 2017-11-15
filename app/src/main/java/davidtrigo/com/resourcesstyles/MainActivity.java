package davidtrigo.com.resourcesstyles;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        private Context contexto = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // obtener el nombre de la app
        String appName= getString(R.string.app_name);
        Log.d(MainActivity.class.getSimpleName(),appName); //Log modo debug para mostrar nombre de la app


       //  int backgroundColor = getResources().getColor(R.color.red); //obtener un color , modo antiguo
        int backgroundColor = ContextCompat.getColor(contexto,R.color.blueAlpha);

        TextView lblTitle = (TextView) findViewById(R.id.lblTitle);
        lblTitle.setBackgroundColor(backgroundColor);
    }
}
