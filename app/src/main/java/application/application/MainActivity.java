package application.application;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button ansBtn = (Button) findViewById(R.id.button);
        final Button unsuccessBtn = (Button) findViewById(R.id.button2);
        final Button questionAir = (Button) findViewById(R.id.button3);
        final Button dashBoard = (Button) findViewById(R.id.button4);
        final ImageView loginImg = (ImageView) findViewById(R.id.loginImg);

//        boolean connected = false;
//        ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
//        if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
//                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
//            //we are connected to a network
//            connected = true;
//            questionAir.setEnabled(false);
//            dashBoard.setEnabled(false);
//        }
//        else {
//            connected = false;
//
//
//        }
//        System.out.println("connected " + connected);

        loginImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(login);
            }
        });

        ansBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent section1 = new Intent(getApplicationContext(), Section1Activity.class);
                startActivity(section1);
            }
        });

        dashBoard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dashboard = new Intent(getApplicationContext(), DashboardActivity.class);
                startActivity(dashboard);
            }
        });

    }
}
