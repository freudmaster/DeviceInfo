
package com.reactlibrary;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNDeviceInformationModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNDeviceInformationModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNDeviceInformation";
  }
  @ReactMethod
  public void getMessage(final Promise promise){
    try {
      String message="freud le boss";
      promise.resolve(message);
    }catch (Exception e){
      promise.reject("ERR_UNEXPECTED_EXCETION",e);
    }
  }
}