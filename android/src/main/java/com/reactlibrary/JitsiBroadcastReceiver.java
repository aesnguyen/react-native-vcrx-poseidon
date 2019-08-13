package com.reactlibrary;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.Context;
import com.facebook.react.bridge.WritableMap;

import java.util.Map;

public class VcrxBroadcastReceiver extends BroadcastReceiver{

    private VcrxPoseidonModule reactModule;

    public void setReactModule(VcrxPoseidonModule module) {
        this.reactModule = module;
    }

    public void onReceive(Context context, Intent intent) {
        Map<String, Object> data = (Map<String, Object>) intent.getSerializableExtra("data");
        WritableMap bridgeableData = MapUtil.toWritableMap(data);
        String action = intent.getAction();
        if (reactModule != null) {
            reactModule.onEventReceived(action, bridgeableData);
        }
    }
}
