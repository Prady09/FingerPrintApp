package com.example.pradnya.fingerprintapp;

import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        private FingerprintManager fingerprintManager;
        private TextView mHeadingLable;
        private ImageView mFingerprintImage;
        private TextView mParaLabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHeadingLable = (TextView)findViewById((R.id.headingLabel));
        mFingerprintImage = (ImageView)findViewById(R.id.fingerprintImage);
        mParaLabel = (TextView)findViewById((R.id.paraLabel));

        // todo check 1: Android version should be greter than marshmallow
        // todo check 2: Device have finger print scanner
        // todo check 3: Have permission to use fingerprint Scanner
        // todo check 4: Lock screen should have atlest one lock
        // todo check 5: Atleat 1 Fingerprint Registered
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){

        }

    }
}
