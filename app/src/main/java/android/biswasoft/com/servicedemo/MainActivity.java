package android.biswasoft.com.servicedemo;

import android.app.Service;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tv;
Button btn;
Button btn2;
TextView tv2;

public ServiceConnection serviceConnection;
public  boolean isServiceConnected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.textView);
        btn=findViewById(R.id.Check);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                serviceConnection=new ServiceConnection() {
                    @Override
                    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                        isServiceConnected=true;
                    }

                    @Override
                    public void onServiceDisconnected(ComponentName componentName) {
                          isServiceConnected=false;
                    }
                };
            }
        });
    }

}
