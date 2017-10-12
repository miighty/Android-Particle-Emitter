package mighty.particleemitter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.plattysoft.leonids.ParticleSystem;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    
    Button red,yellow,redder,green,sparkle;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        findViewById(R.id.view).setOnClickListener(this);
        red = (Button) findViewById(R.id.red_on);
        yellow = (Button) findViewById(R.id.yelllow_on);
        green = (Button) findViewById(R.id.green_on);
        redder = (Button) findViewById(R.id.redder_on);
        sparkle = (Button) findViewById(R.id.sparkle_on);
        textView = (TextView) findViewById(R.id.textView);
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ParticleSystem(MainActivity.this, 80, R.mipmap.ic_red_heart, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.1f, 120, 120)
                .setRotationSpeed(100)
                .setAcceleration(0.00005f, 45)
                .emit(findViewById(R.id.red), 8);
                textView.setVisibility(View.GONE);
                v.setVisibility(View.GONE);
            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ParticleSystem(MainActivity.this, 80, R.mipmap.ic_yellow_heart, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.1f, 120, 120)
                .setRotationSpeed(100)
                .setAcceleration(0.00005f, 45)
                .emit(findViewById(R.id.yellow), 8);
                textView.setVisibility(View.GONE);
                v.setVisibility(View.GONE);
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ParticleSystem(MainActivity.this, 80, R.mipmap.ic_green_heart, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.1f, 120, 120)
                .setRotationSpeed(100)
                .setAcceleration(0.00005f, 45)
                .emit(findViewById(R.id.green), 8);
                textView.setVisibility(View.GONE);
                v.setVisibility(View.GONE);
            }
        });
        redder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ParticleSystem(MainActivity.this, 80, R.mipmap.ic_redder_heart, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.1f, 120, 120)
                .setRotationSpeed(100)
                .setAcceleration(0.00005f, 45)
                .emit(findViewById(R.id.red), 8);
                textView.setVisibility(View.GONE);
                v.setVisibility(View.GONE);
            }
        });
        
        sparkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ParticleSystem(MainActivity.this, 80, R.mipmap.ic_sparkle_heart, 10000)
                .setSpeedModuleAndAngleRange(0f, 0.1f, 120, 120)
                .setRotationSpeed(100)
                .setAcceleration(0.00005f, 45)
                .emit(findViewById(R.id.sparkle), 8);
                textView.setVisibility(View.GONE);
                v.setVisibility(View.GONE);
            }
        });
    }
    
    @Override
    public void onClick(View arg0) {
        new ParticleSystem(this, 80, R.mipmap.ic_sparkle_heart, 10000)
        .setSpeedModuleAndAngleRange(0f, 0.2f, 100, 100)
        .setRotationSpeed(144)
        .setAcceleration(0.00005f, 90)
        .emit(findViewById(R.id.green), 8);
        
    }
}
