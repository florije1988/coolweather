package com.coolweather.app.util;

/**
 * Created by florije on 2015/1/29.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
