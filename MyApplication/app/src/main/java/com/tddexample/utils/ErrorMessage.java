package com.tddexample.utils;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
@StringDef({
        ErrorMessage.SHORT_PASSWORD,
        ErrorMessage.SHORT_USERNAME,
        ErrorMessage.NO_INTERNET
})

public @interface ErrorMessage {
    String SHORT_PASSWORD = "Password shorter then 6 characters";
    String SHORT_USERNAME = "Username shorter then 5 characters";
    String NO_INTERNET = "No internet connection";
}