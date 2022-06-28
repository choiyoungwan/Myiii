package com.example.myapplicationsadasz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.unity3d.player.UnityPlayer;

public class MainActivity2 extends UnityPlayerActivity {
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mUnityPlayer = new UnityPlayer(this);
        int glesMode = mUnityPlayer.getSettings().getInt("gles_mode", 1);
        boolean trueColor8888 = false;
        mUnityPlayer.init(glesMode, trueColor8888);
        mUnityPlayer.requestFocus();

        setContentView(R.layout.activity_main2);

        frameLayout = (FrameLayout) findViewById(R.id.fram);


        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.FILL_PARENT);
        frameLayout.addView(mUnityPlayer.getView(), 0, lp);

    }
}