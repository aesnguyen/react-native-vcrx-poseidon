
package com.reactlibrary;

import android.content.Intent;
import android.content.IntentFilter;

import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

public class VcrxPoseidonModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public VcrxPoseidonModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "VcrxPoseidon";
  }

  @ReactMethod
  public void initialize() {
    FLog.d("VcrxPoseidon", "Initialize");
    ReactApplicationContext context = getReactApplicationContext();
    this.eventEmitter = context.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    VcrxBroadcastReceiver receiver = new VcrxBroadcastReceiver();
    receiver.setReactModule(this);
    IntentFilter filter = new IntentFilter();
    filter.addAction("CONFERENCE_FAILED");
    filter.addAction("CONFERENCE_JOINED");
    filter.addAction("CONFERENCE_LEFT");
    filter.addAction("CONFERENCE_WILL_JOIN");
    filter.addAction("CONFERENCE_WILL_LEAVE");
    filter.addAction("LOAD_CONFIG_ERROR");
    context.getCurrentActivity().registerReceiver(receiver, filter, context.getPackageName() + ".permission.JITSI_BROADCAST", null);
  }

  @ReactMethod
  public void call(String url) {
      ReactApplicationContext context = getReactApplicationContext();
      Intent intent = new Intent(context, VcrxPoseidonNavigatorActivity.class);
      intent.putExtra("url", url);
      intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      context.startActivity(intent);
  }

  public void onEventReceived(String event, WritableMap data) {
      eventEmitter.emit(event, data);
  }
}