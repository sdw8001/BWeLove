package kr.ddfactory.bwelove;

import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    //GPS
    LocationManager locationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //LocationManager
        locationManager = (LocationManager)getSystemService(LOCATION_SERVICE);
    }

    @OnClick({R.id.button_test_bus})
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.button_test_bus:
//                intent = new Intent(this, BusListActivity.class);
//                startActivity(intent);

                //GPS가 켜져있는지 체크
                if(!locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)){
                    //GPS 설정화면으로 이동
                    intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                    intent.addCategory(Intent.CATEGORY_DEFAULT);
                    startActivity(intent);
                }

                break;
        }
    }
}
