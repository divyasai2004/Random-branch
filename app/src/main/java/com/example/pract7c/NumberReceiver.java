package com.example.pract7c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;

public class NumberReceiver extends BroadcastReceiver {
    static String allnum="";
    @Override
    public void onReceive(Context context, Intent intent) {

        String state=intent.getStringExtra(TelephonyManager.EXTRA_STATE);
        if(state.equals(TelephonyManager.EXTRA_STATE_RINGING))
        {
            String number=intent.getExtras().getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
            allnum=allnum+"\n"+number;
            MainActivity.getInstance().myMethod(allnum);
        }

    }
}
