package com.example.myapplicationsadasz;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity2 extends UnityPlayerActivity {
    FrameLayout frameLayout;
//    UnityPlayer mUnityPlayer;
//    UnityPlayerActivity unityPlayerActivity;
//    = new UnityPlayerActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        mUnityPlayer = new UnityPlayer(this);

        int glesMode = mUnityPlayer.getSettings().getInt("gles_mode", 1);
        boolean trueColor8888 = false;
        mUnityPlayer.init(glesMode, trueColor8888);
        mUnityPlayer.requestFocus();

        setContentView(R.layout.activity_main2);

        frameLayout = (FrameLayout) findViewById(R.id.fram);
        Button btn_ss= findViewById(R.id.btn_ss);
        btn_ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mUnityPlayer.UnitySendMessage("EventSystem", "showMessage", "바껴라 야압!!!");
            }
        });

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.FILL_PARENT);
        frameLayout.addView(mUnityPlayer.getView(), 0, lp);

    }
    public void receiveStr(String msg) {

        Log.e("데이터 전달", msg);

    }


}