package com.sematec.sematecandroidbasicmordadfridays;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class TestBroadcast extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "AIRPLANE MODE CHANGED", Toast.LENGTH_SHORT).show();
    }
}
