package com.slkerndnme.cordova.bgcolor;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Context;
import android.graphics.Color;

public class BackgroundColor extends CordovaPlugin {

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {

        Context context = cordova.getActivity();

        int backgroundColorResourceId = context.getResources().getIdentifier("CUSTOM_BACKGROUND_COLOR", "color", context.getPackageName());
        int backgroundColor = context.getResources().getColor(backgroundColorResourceId);

        webView.getView().setBackgroundColor(backgroundColor);
    }
}