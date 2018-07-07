package com.atilsamancioglu.instagramcloneparseexample;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterActivity extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        Parse.initialize(new Parse.Configuration.Builder(this)
        .applicationId("7tzuSs9NGqb3GhwEgP3cqLdffFzQ46R6EGrazsCY")
        .clientKey("xvC9yS4N8GQznEBCMYzuNjqAUs315I0x89ppJJwq")
        .server("https://parseapi.back4app.com/")
        .build()
        );


    }
}
