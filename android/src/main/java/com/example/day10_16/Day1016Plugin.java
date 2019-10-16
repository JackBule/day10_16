package com.example.day10_16;

import android.content.Context;
import android.widget.Toast;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.Registrar;

/** Day1016Plugin */
public class Day1016Plugin implements MethodCallHandler {
  Context context;

  public Day1016Plugin(Context context) {
    this.context = context;
  }

  /** Plugin registration. */
  public static void registerWith(Registrar registrar) {
    final MethodChannel channel = new MethodChannel(registrar.messenger(), "day10_16");
    channel.setMethodCallHandler(new Day1016Plugin(registrar.context()));
  }

  @Override
  public void onMethodCall(MethodCall call, Result result) {
    if (call.method.equals("getPlatformVersion")) {
      result.success("Android " + android.os.Build.VERSION.RELEASE);
    }else if (call.method.equals("toast")){
      Toast.makeText(context,(String)call.arguments,Toast.LENGTH_SHORT).show();

    }else {
      result.notImplemented();
    }
  }
}
